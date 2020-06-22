#ifndef FACE_AAR_OPENCVLANDMARKTOOL_H
#define FACE_AAR_OPENCVLANDMARKTOOL_H

#include "../ILandmarkTool.h"
#include <opencv2/face.hpp>

class OpencvLandmarkTool : public ILandmarkTool{
private:
    const char *pathTool;
    cv::Ptr<cv::face::Facemark> facemark;

    bool modelExist();

public:
    OpencvLandmarkTool(
      const char* path
    );

    ~OpencvLandmarkTool();

    bool loadLandmarkTool();

    bool analyzeLandmark(
        void* facesRectPtr,
        void* imgPtr,
        void* shapePtr
    );

};


#endif //FACE_AAR_OPENCVLANDMARKTOOL_H
