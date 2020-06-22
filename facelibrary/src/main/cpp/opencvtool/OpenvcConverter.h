
#ifndef OPENCVFACEDLIB_CONVERTER_H
#define OPENCVFACEDLIB_CONVERTER_H

#include <jni.h>
#include <opencv2/opencv.hpp>

class Converte {

public:
    static void BitmapToRGBAMat(JNIEnv* env, jobject& bitmap, cv::Mat& dst,
                                bool needUnPremultiplyAlpha);
};


#endif //OPENCVFACEDLIB_CONVERTER_H
