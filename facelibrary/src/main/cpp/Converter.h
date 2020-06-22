//
// Created by jonathas on 24/06/19.
//

#include <jni.h>
#include <dlib/array2d.h>
#include <dlib/pixel.h>
#include <opencv2/core/mat.hpp>

#ifndef CONVERTERT_H
#define CONVERTERT_H

class Converter {

public:
    void bitmapTo2DMatrix(
      JNIEnv* env,
      jobject bitmap,
      dlib::array2d<dlib::rgb_pixel>& out
    );

    void byteToCvMap(
      jbyte* bytes,
      int amountBytes,
      cv::Mat* result
    );

    void rotate(
      cv::Mat& src,
      double angle,
      cv::Mat& dst
    );

    void cvMapToDlibArray2d(
      cv::Mat& src,
      dlib::array2d<dlib::rgb_pixel>& out
    );
};


#endif //FACEDLIB_BITMAPTORGBAMAT_H
