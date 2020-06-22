//
// Created by jonathas on 08/07/19.
//

#ifndef FACEDLIB_ILANDMARKTOOL_H
#define FACEDLIB_ILANDMARKTOOL_H

class ILandmarkTool {

public:
    virtual bool loadLandmarkTool() = 0;

    virtual bool analyzeLandmark(
      void* facesRect,
      void* img,
      void* shape
    ) = 0;

    virtual ~ILandmarkTool(){};
};


#endif //FACEDLIB_ILANDMARKTOOL_H
