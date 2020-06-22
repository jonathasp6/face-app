//
// Created by jonathas on 25/06/19.
//

#include "DlibLandmarkTool.h"
#include <android/log.h>

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, "com.my.jni.dlib.dlib-jni-LandmarkTool:", __VA_ARGS__))

using namespace dlib;

DlibLandmarkTool::DlibLandmarkTool(
  const char* path
) {
    pathTool = path;
}

DlibLandmarkTool::~DlibLandmarkTool()
{
}

bool DlibLandmarkTool::loadLandmarkTool()
{
    if (!modelExist()) {
        return false;
    }

    dlib::deserialize(pathTool) >> sp;
    int numberPart = sp.num_parts();
    LOGI("L%d: Number of parts %d",__LINE__, numberPart);
    if (numberPart > 0) {
        return true;
    }

    return false;
}

bool DlibLandmarkTool::analyzeLandmark(
  void* facesRectPtr,
  void* imgPtr,
  void* shapePtr
) {
    dlib::rectangle* faceRect = (dlib::rectangle*) facesRectPtr;
    dlib::array2d<dlib::rgb_pixel>* img = (dlib::array2d<dlib::rgb_pixel>*) imgPtr;
    dlib::full_object_detection* shape = (dlib::full_object_detection*) shapePtr;
    LOGI("L%d: Start analyze", __LINE__);
    *shape = sp(*img, *faceRect);
    LOGI("L%d: %lu landmarks detected", __LINE__, shape->num_parts());
    return true;
}

bool DlibLandmarkTool::modelExist()
{
    FILE *file;

    if ((file = fopen(pathTool, "r"))) {
        fclose(file);
        return true;
    }

    LOGI("L%d: Model not found! %s",__LINE__, pathTool);
    return false;
}