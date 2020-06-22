//
// Created by jonathas on 11/07/19.
//

#include "DlibFaceDetector.h"
#include "../Converter.h"
#include <android/log.h>
#include <dlib/image_processing/frontal_face_detector.h>
#include <dlib/geometry/rectangle.h>
#include <dlib/array2d.h>
#include <dlib/pixel.h>

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, "com.my.jni.dlib.dlib-jni-FaceDetectorTool:", __VA_ARGS__))

void DlibFaceDetector::detectBitmap(
  void* facesPtr,
  JNIEnv* env,
  jobject& bitmap
)
{
    dlib::array2d<dlib::rgb_pixel> img;
    Converter d;
    d.bitmapTo2DMatrix(env, bitmap, img);
    std::vector<dlib::rectangle>* faces = (std::vector<dlib::rectangle>*) facesPtr ;


    dlib::frontal_face_detector detector = dlib::get_frontal_face_detector();
    *faces = detector(img);
    LOGI("L%d: Number of faces detected: %u", __LINE__, (int) faces->size());
}