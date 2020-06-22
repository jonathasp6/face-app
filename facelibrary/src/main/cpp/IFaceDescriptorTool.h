//
// Created by jonathas on 08/07/19.
//

#ifndef FACEDLIB_IFACEDESCRIPTORTOOL_H
#define FACEDLIB_IFACEDESCRIPTORTOOL_H


class IFaceDescriptorTool {

public:

    virtual bool loadFaceDescriptorTool() = 0;

    virtual std::string extract(
      void* img,
      void* shape
    ) = 0;

    virtual ~IFaceDescriptorTool() {};
};

#endif //FACEDLIB_IFACEDESCRIPTORTOOL_H
