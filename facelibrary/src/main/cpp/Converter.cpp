#include "Converter.h"
#include <android/bitmap.h>
#include <android/log.h>
#include <dlib/opencv/cv_image.h>
#include <dlib/image_transforms/assign_image.h>
#include <opencv2/imgcodecs.hpp>
#include <opencv2/imgproc.hpp>

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, "com.my.jni.dlib.dlib-jni-BitmapTo2DMatrix:", __VA_ARGS__))

void Converter::bitmapTo2DMatrix(
  JNIEnv* env,
  jobject bitmap,
  dlib::array2d<dlib::rgb_pixel>& out
){
    AndroidBitmapInfo bitmapInfo;
    void* pixels;
    int state;

    if (0 > (state = AndroidBitmap_getInfo(env, bitmap, &bitmapInfo))) {
        LOGI("L%d: AndroidBitmap_getInfo() failed! error=%d", __LINE__, state);
        return;
    } else if (bitmapInfo.format != ANDROID_BITMAP_FORMAT_RGBA_8888) {
        LOGI("L%d: Bitmap format is not RGB_565!", __LINE__);
    }


    // Lock the bitmap for copying the pixels safely.
    if (0 > (state = AndroidBitmap_lockPixels(env, bitmap, &pixels))) {
        LOGI("L%d: AndroidBitmap_lockPixels() failed! error=%d", __LINE__, state);
        return;
    }

    LOGI("L%d: info.width=%d, info.height=%d", __LINE__, bitmapInfo.width, bitmapInfo.height);
    out.set_size((long) bitmapInfo.height, (long) bitmapInfo.width);

    char* line = (char*) pixels;
    for (int h = 0; h < bitmapInfo.height; ++h) {
        for (int w = 0; w < bitmapInfo.width; ++w) {
            uint32_t* color = (uint32_t*) (line + 4 * w);

            out[h][w].red = (unsigned char) (0xFF & ((*color) >> 24));
            out[h][w].green = (unsigned char) (0xFF & ((*color) >> 16));
            out[h][w].blue = (unsigned char) (0xFF & ((*color) >> 8));
        }

        line = line + bitmapInfo.stride;
    }

    // Unlock the bitmap.
    AndroidBitmap_unlockPixels(env, bitmap);
}

void Converter::byteToCvMap(
  jbyte* bytes,
  int amountBytes,
  cv::Mat* result
){
    int j;
    std::vector<jbyte> vectorData;
    for (j = 0; j < amountBytes ; ++j) {
        vectorData.push_back(bytes[j]);
    }

    cv::Mat data_mat(vectorData, true);
    cv::Mat img = cv::imdecode(data_mat, 1);
    rotate(img, 90, *result);
}

// Return the rotation matrices for each rotation
void Converter::rotate(
  cv::Mat& src,
  double angle,
  cv::Mat& dst
) {
    cv::Mat r = getRotationMatrix2D(cv::Point2f(), angle, 1.0);

    //4 coordinates of the image
    std::vector<cv::Point2f> corners(4);
    corners[0] = cv::Point2f(0, 0);
    corners[1] = cv::Point2f(0, src.rows);
    corners[2] = cv::Point2f(src.cols, 0);
    corners[3] = cv::Point2f(src.cols, src.rows);

    std::vector<cv::Point2f> cornersTransform(4);
    cv::transform(corners, cornersTransform, r);

    //Copy the 2x3 transformation matrix into a 3x3 transformation matrix
    cv::Mat H = cv::Mat::eye(3, 3, CV_64F);
    for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 3; j++) {
            H.at<double>(i, j) = r.at<double>(i, j);
        }
    }

    double offsetX = 0.0, offsetY = 0.0, maxX = 0.0, maxY = 0.0;
    //Get max offset outside of the image and max width / height
    for(size_t i = 0; i < 4; i++) {
        if(cornersTransform[i].x < offsetX) {
            offsetX = cornersTransform[i].x;
        }

        if(cornersTransform[i].y < offsetY) {
            offsetY = cornersTransform[i].y;
        }

        if(cornersTransform[i].x > maxX) {
            maxX = cornersTransform[i].x;
        }

        if(cornersTransform[i].y > maxY) {
            maxY = cornersTransform[i].y;
        }
    }

    offsetX = -offsetX;
    offsetY = -offsetY;
    maxX += offsetX;
    maxY += offsetY;

    cv::Size size_warp(maxX, maxY);

    //Create the transformation matrix to be able to have all the pixels
    cv::Mat H2 = cv::Mat::eye(3, 3, CV_64F);
    H2.at<double>(0,2) = offsetX;
    H2.at<double>(1,2) = offsetY;

    warpPerspective(src, dst, H2*H, size_warp);
}

void Converter::cvMapToDlibArray2d(
 cv::Mat& src,
 dlib::array2d<dlib::rgb_pixel>& out
){
    dlib::cv_image<dlib::rgb_pixel> img_temp(src);
    dlib::assign_image(out, img_temp);
}