#include <jni.h>
#include <string>
#include "Converter.h"
#include "IFaceDetectorTool.h"
#include "ILandmarkTool.h"
#include "IFaceDescriptorTool.h"
#include "dlibtool/DlibLandmarkTool.h"
#include "dlibtool/DlibFaceDescriptorTool.h"
#include "opencvtool/OpencvFaceDetector.h"
#include <android/log.h>

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, "face-library:", __VA_ARGS__))

static IFaceDescriptorTool *faceDescriptorTool;
static ILandmarkTool *landmarkTool;
static IFaceDetectorTool* opencvFaceDetector;

extern "C"
JNIEXPORT void JNICALL
Java_br_com_face_facelibrary_ToolBridge_startTool(
        JNIEnv *env,  jclass clazz,
        jstring modelPath_, jstring landmark5Path_,
        jstring faceDetector_
) {
    const char *modelPath =  env->GetStringUTFChars(modelPath_, 0);
    const char *landmark5Path = env->GetStringUTFChars(landmark5Path_, 0);
    const char *faceDetector = env->GetStringUTFChars(faceDetector_, 0);
    LOGI("L%d: %s", __LINE__, modelPath);
    LOGI("L%d: %s", __LINE__, landmark5Path);
    LOGI("L%d: %s", __LINE__, faceDetector);

    landmarkTool = new DlibLandmarkTool(landmark5Path);
    faceDescriptorTool = new DlibFaceDescriptorTool(modelPath);
    opencvFaceDetector = new OpencvFaceDetector(faceDetector);

    landmarkTool->loadLandmarkTool();
    LOGI("L%d: Landmarks analyze started.", __LINE__);
    faceDescriptorTool->loadFaceDescriptorTool();
    LOGI("L%d: Face descriptor tool started.", __LINE__);
    opencvFaceDetector->loadFaceDetectorTool();

    env->ReleaseStringUTFChars(modelPath_, modelPath);
    env->ReleaseStringUTFChars(landmark5Path_, landmark5Path);
    env->ReleaseStringUTFChars(faceDetector_, faceDetector);
}

extern "C"
JNIEXPORT void JNICALL
Java_br_com_face_facelibrary_ToolBridge_finishTool(
        JNIEnv *env,
        jclass clazz
 ) {
    LOGI("L%d: Finishing tools", __LINE__);
    delete landmarkTool;
    LOGI("L%d: Landmarks analyze finished.", __LINE__);
    delete faceDescriptorTool;
    LOGI("L%d: Face descriptor tool finished.", __LINE__);
    delete opencvFaceDetector;
}

extern "C"
JNIEXPORT jstring JNICALL
Java_br_com_face_facelibrary_ToolBridge_analyzeFaceParameter(
        JNIEnv *env,
        jclass clazz,
        jbyteArray bytes_,
        jint size
) {
    jbyte *jpegData = env->GetByteArrayElements(bytes_, NULL);
    cv::Mat matImage;
    Converter converter;
    converter.byteToCvMap(jpegData, size, &matImage);
    dlib::array2d<dlib::rgb_pixel> img;
    converter.cvMapToDlibArray2d(matImage, img);

    std::vector<cv::Rect> faces;
    opencvFaceDetector->detect(&faces, &matImage);
    std::string description = "NO_FACE";

    for (unsigned long i = 0; i < faces.size(); ++i) {
        dlib::rectangle face = dlib::rectangle((long) faces.at(i).tl().x,
                                               (long) faces.at(i).tl().y,
                                               (long) faces.at(i).br().x - 1,
                                               (long) faces.at(i).br().y - 1);
        dlib::full_object_detection shape;
        landmarkTool->analyzeLandmark(&face, &img, &shape);
        description = faceDescriptorTool->extract(&img, &shape);
    }

    int n = description.length();
    char char_description[n + 1];
    strcpy(char_description, description.c_str());

    jstring jdescription = env->NewStringUTF(char_description);
    return jdescription;
}