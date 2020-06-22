#include "OpencvFaceDetector.h"
#include <android/log.h>
#include "OpenvcConverter.h"

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, "com.my.jni.dlib.dlib-jni-OpencvFaceDetector:", __VA_ARGS__))

using namespace cv;
using namespace std;

OpencvFaceDetector::OpencvFaceDetector(
  const char* path
) {
    pathTool = path;
}

OpencvFaceDetector::~OpencvFaceDetector()
{

}

bool OpencvFaceDetector::loadFaceDetectorTool()
{
    if (!modelExist()) {
        return false;
    }

    if (!face_cascade.load(pathTool)) {
        LOGI("L%d: Não encontrado", __LINE__);
        return false;
    }

    return true;
}

void OpencvFaceDetector::detectBitmap(
  void* facesPtr,
  JNIEnv* env,
  jobject& bitmap
) {
    std::vector<Rect>* faces = (std::vector<Rect>*) facesPtr;
    Mat frame_gray;

    Mat image;
    Converte::BitmapToRGBAMat(env, bitmap, image, true);
    cvtColor(image, frame_gray, COLOR_BGR2GRAY);
    equalizeHist( frame_gray, frame_gray);

    //-- Detect faces
    face_cascade.detectMultiScale(frame_gray, *faces, 1.3, 2, CASCADE_FIND_BIGGEST_OBJECT, Size(30, 30) );
    LOGI("L%d: Number of faces detected: %u",
         __LINE__, (int) faces->size());
}

void OpencvFaceDetector::detect(
  void* facesPtr,
  void* img
) {
    Mat* image = (Mat*) img;
    std::vector<Rect>* faces = (std::vector<Rect>*) facesPtr;
    Mat frame_gray;
    cvtColor(*image, frame_gray, COLOR_BGR2GRAY);
    equalizeHist(frame_gray, frame_gray);

    //-- Detect faces
    face_cascade.detectMultiScale(frame_gray, *faces, 1.3, 2, CASCADE_FIND_BIGGEST_OBJECT, Size(30, 30) );
    if (faces->size() > 1) {
        filterBiggest(faces);
    }

    LOGI("L%d: Number of faces detected: %u",
         __LINE__, (int) faces->size());
}

void OpencvFaceDetector::filterBiggest(
  std::vector<cv::Rect>* faces
)
{
    int biggestSize = 0;
    int idBiggest = 0;
    for (int i = 0; i < faces->size(); ++i) {
        cv::Rect face = faces->at(i);
        Point pTopLeft = face.tl();
        Point pBottomRight = face.br();
        long x1 = (long)pTopLeft.x;
        long x2 = (long)pBottomRight.x - 1;
        long distance = x2-x1;

        if (distance > biggestSize) {
            idBiggest = i;
        }
    }

    cv::Rect face = faces->at(idBiggest);
    faces->clear();
    faces->push_back(face);
}


bool OpencvFaceDetector::modelExist()
{
    FILE *file;

    if ((file = fopen(pathTool, "r"))) {
        fclose(file);
        return true;
    }

    LOGI("L%d: Model not found!",__LINE__);
    return false;
}