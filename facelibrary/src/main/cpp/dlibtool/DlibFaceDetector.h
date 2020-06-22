//
// Created by jonathas on 11/07/19.
//

#ifndef FACE_DLIBFACEDETECTOR_H
#define FACE_DLIBFACEDETECTOR_H

#include "../IFaceDetectorTool.h"

class DlibFaceDetector : public IFaceDetectorTool {

public:
    DlibFaceDetector() {}

    virtual bool loadFaceDetectorTool() { return true;}

    virtual void detectBitmap(
      void* facesPtr,
      JNIEnv* env,
      jobject& bitmap
    );

    virtual void detect(
      void* facesPtr,
      void* img
    ) {}

};


#endif //FACE_DLIBFACEDETECTOR_H
