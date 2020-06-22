//
// Created by jonathas on 08/07/19.
//

#ifndef FACEDLIB_OPENCVFACEDETECTOR_H
#define FACEDLIB_OPENCVFACEDETECTOR_H

#include <jni.h>
#include <opencv2/opencv.hpp>
#include "../IFaceDetectorTool.h"

class OpencvFaceDetector : public IFaceDetectorTool  {

public:
    OpencvFaceDetector(
      const char* path
    );

    ~OpencvFaceDetector();

    virtual bool loadFaceDetectorTool();

    virtual void detectBitmap(
      void* facesPtr,
      JNIEnv* env,
      jobject& bitmap
    );

    virtual void detect(
      void* facesPtr,
      void* img
    );

    void filterBiggest(
      std::vector<cv::Rect>* faces
    );

private:
    cv::CascadeClassifier face_cascade;
    const char *pathTool;

    bool modelExist();
};


#endif //FACEDLIB_OPENCVFACEDETECTOR_H
