//
// Created by jonathas on 27/06/19.
//

#include "DlibFaceDescriptorTool.h"
#include <android/log.h>
#include <stdio.h>
#include <string.h>

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, "com.my.jni.dlib.dlib-jni-FaceDescriptorTool:", __VA_ARGS__))

using namespace dlib;
using namespace std;

DlibFaceDescriptorTool::DlibFaceDescriptorTool(
  const char* path
)
{
    pathTool = path;
}

DlibFaceDescriptorTool::~DlibFaceDescriptorTool()
{
}

bool DlibFaceDescriptorTool::loadFaceDescriptorTool()
{
    if (!modelExist()) {
        return false;
    }
    deserialize(pathTool) >> net;

    return true;
}

std::string DlibFaceDescriptorTool::extract(
  void* imgPtr,
  void* shapePtr
) {
    dlib::array2d<dlib::rgb_pixel>* img = (dlib::array2d<dlib::rgb_pixel>*) imgPtr;
    dlib::full_object_detection* shape =  (dlib::full_object_detection*) shapePtr;
    //for each face extract a copy that has been normalized to 150x150 pixels in size and appropriately rotated
    // and centered.
    matrix<rgb_pixel> face_chip;
    extract_image_chip(*img, get_face_chip_details(*shape, 150, 0.25), face_chip);
    std::vector<matrix<rgb_pixel>> faces;
    faces.push_back(std::move(face_chip));

    std::vector<matrix<float, 0, 1>> face_descriptors = net(faces);
    string descriptions = " ";
    for (int i = 0; i <face_descriptors.size(); i++) {
        matrix<float, 0, 1> M = face_descriptors[i];
        for (long r = 0; r < M.nr(); ++r) {
            // loop over all the columns
            for (long c = 0; c < M.nc(); ++c) {
                float value = M(r, c);
                descriptions += " " + to_string(value);

            }
        }
    }
    LOGI("L%d: Face descriptor: %s", __LINE__, descriptions.c_str());
    return descriptions;
}

bool DlibFaceDescriptorTool::modelExist()
{
    FILE *file;

    if ((file = fopen(pathTool, "r"))) {
        fclose(file);
        return true;
    }

    LOGI("L%d: Model not found!",__LINE__);
    return false;
}