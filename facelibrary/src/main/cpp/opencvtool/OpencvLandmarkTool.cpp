#include "OpencvLandmarkTool.h"
#include <opencv2/opencv.hpp>
#include <cstdio>

OpencvLandmarkTool::OpencvLandmarkTool(
  const char* path
){
    pathTool = path;
}

OpencvLandmarkTool::~OpencvLandmarkTool() {

}

bool OpencvLandmarkTool::loadLandmarkTool(){
    if (!modelExist()) {
        return false;
    }

    facemark = cv::face::createFacemarkLBF();
    facemark->loadModel(pathTool);

    std::vector<cv::Point3d> pts3d;
    cv::FileStorage fs2("points3d.yml",0);
    fs2["points"] >> pts3d;
    fs2.release();

    return true;
}

bool OpencvLandmarkTool::analyzeLandmark(
  void* facesRectPtr,
  void* imgPtr,
  void* shapePtr
){
    cv::Rect* rects = (cv::Rect*) facesRectPtr;
    std::vector<cv::Rect> faces(1,rects[0]);
    std::vector< std::vector<cv::Point2f> >* shapes = (std::vector< std::vector<cv::Point2f> >*) shapePtr;
    cv::Mat* matImage = (cv::Mat*) imgPtr;
    return facemark->fit(*matImage, faces, *shapes);
}

bool OpencvLandmarkTool::modelExist(){
    FILE *file;

    if ((file = fopen(pathTool, "r"))) {
        fclose(file);
        return true;
    }

    return false;
}