//
// Created by jonathas on 25/06/19.
//

#ifndef FACEDLIB_LANDMARKTOOL_H
#define FACEDLIB_LANDMARKTOOL_H

#include <jni.h>

#include <dlib/image_processing/shape_predictor.h>
#include <dlib/image_processing/full_object_detection.h>

#include <dlib/geometry/rectangle.h>
#include <dlib/array2d.h>
#include <dlib/pixel.h>
#include "../ILandmarkTool.h"

class DlibLandmarkTool : public ILandmarkTool {

private:
    const char *pathTool;
    dlib::shape_predictor sp;

    bool modelExist();

public:
    DlibLandmarkTool(
      const char* path
    );

    ~DlibLandmarkTool();

    bool loadLandmarkTool();

    bool analyzeLandmark(
      void* facesRectPtr,
      void* imgPtr,
      void* shapePtr
    );
};


#endif //FACEDLIB_DLIBLANDMARKTOOL_H
