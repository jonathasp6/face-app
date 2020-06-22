//
// Created by jonathas on 24/06/19.
//

#ifndef FACEDLIB_IFACEDETECTORTOOL_H
#define FACEDLIB_IFACEDETECTORTOOL_H

#include <jni.h>

class IFaceDetectorTool {

public:
    virtual bool loadFaceDetectorTool() = 0;

    virtual void detectBitmap(
      void* facesPtr,
      JNIEnv* env,
      jobject& bitmap
    ) = 0;

    virtual void detect(
      void* facesPtr,
      void* img
    ) = 0;

    virtual ~IFaceDetectorTool(){};
};


#endif //FACEDLIB_DETECTFACES_H
