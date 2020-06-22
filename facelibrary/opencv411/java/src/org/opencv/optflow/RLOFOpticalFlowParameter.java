//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;

import org.opencv.optflow.RLOFOpticalFlowParameter;

// C++: class RLOFOpticalFlowParameter
/**
 * This is used store and set up the parameters of the robust local optical flow (RLOF) algoritm.
 *
 * The RLOF is a fast local optical flow approach described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014
 * and CITE: Senst2016 similar to the pyramidal iterative Lucas-Kanade method as
 * proposed by CITE: Bouguet00. The implementation is derived from optflow::calcOpticalFlowPyrLK().
 * This RLOF implementation can be seen as an improved pyramidal iterative Lucas-Kanade and includes
 * a set of improving modules. The main improvements in respect to the pyramidal iterative Lucas-Kanade
 * are:
 * - A more robust redecending M-estimator framework (see CITE: Senst2012) to improve the accuracy at
 * motion boundaries and appearing and disappearing pixels.
 * - an adaptive support region strategies to improve the accuracy at motion boundaries to reduce the
 * corona effect, i.e oversmoothing of the PLK at motion/object boundaries. The cross-based segementation
 * strategy (SR_CROSS) proposed in CITE: Senst2014 uses a simple segmenation approach to obtain the optimal
 * shape of the support region.
 * - To deal with illumination changes (outdoor sequences and shadow) the intensity constancy assumption
 * based optical flow equation has been adopt with the Gennert and Negahdaripour illumination model
 * (see CITE: Senst2016). This model can be switched on/off with the useIlluminationModel variable.
 * - By using a global motion prior initialization (see CITE: Senst2016) of the iterative refinement
 * the accuracy could be significantly improved for large displacements. This initialization can be
 * switched on and of with useGlobalMotionPrior variable.
 *
 * The RLOF can be computed with the SparseOpticalFlow class or function interface to track a set of features
 * or with the DenseOpticalFlow class or function interface to compute dense optical flow.
 *
 * SEE: optflow::DenseRLOFOpticalFlow, optflow::calcOpticalFlowDenseRLOF(), optflow::SparseRLOFOpticalFlow, optflow::calcOpticalFlowSparseRLOF()
 */
public class RLOFOpticalFlowParameter {

    protected final long nativeObj;
    protected RLOFOpticalFlowParameter(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static RLOFOpticalFlowParameter __fromPtr__(long addr) { return new RLOFOpticalFlowParameter(addr); }

    //
    // C++: static Ptr_RLOFOpticalFlowParameter cv::optflow::RLOFOpticalFlowParameter::create()
    //

    public static RLOFOpticalFlowParameter create() {
        return RLOFOpticalFlowParameter.__fromPtr__(create_0());
    }


    //
    // C++:  SolverType cv::optflow::RLOFOpticalFlowParameter::getSolverType()
    //

    // Return type 'SolverType' is not supported, skipping the function


    //
    // C++:  SupportRegionType cv::optflow::RLOFOpticalFlowParameter::getSupportRegionType()
    //

    // Return type 'SupportRegionType' is not supported, skipping the function


    //
    // C++:  bool cv::optflow::RLOFOpticalFlowParameter::getUseGlobalMotionPrior()
    //

    public boolean getUseGlobalMotionPrior() {
        return getUseGlobalMotionPrior_0(nativeObj);
    }


    //
    // C++:  bool cv::optflow::RLOFOpticalFlowParameter::getUseIlluminationModel()
    //

    public boolean getUseIlluminationModel() {
        return getUseIlluminationModel_0(nativeObj);
    }


    //
    // C++:  bool cv::optflow::RLOFOpticalFlowParameter::getUseInitialFlow()
    //

    public boolean getUseInitialFlow() {
        return getUseInitialFlow_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getGlobalMotionRansacThreshold()
    //

    public float getGlobalMotionRansacThreshold() {
        return getGlobalMotionRansacThreshold_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getMinEigenValue()
    //

    public float getMinEigenValue() {
        return getMinEigenValue_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getNormSigma0()
    //

    public float getNormSigma0() {
        return getNormSigma0_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getNormSigma1()
    //

    public float getNormSigma1() {
        return getNormSigma1_0(nativeObj);
    }


    //
    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getCrossSegmentationThreshold()
    //

    public int getCrossSegmentationThreshold() {
        return getCrossSegmentationThreshold_0(nativeObj);
    }


    //
    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getLargeWinSize()
    //

    public int getLargeWinSize() {
        return getLargeWinSize_0(nativeObj);
    }


    //
    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getMaxIteration()
    //

    public int getMaxIteration() {
        return getMaxIteration_0(nativeObj);
    }


    //
    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getMaxLevel()
    //

    public int getMaxLevel() {
        return getMaxLevel_0(nativeObj);
    }


    //
    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getSmallWinSize()
    //

    public int getSmallWinSize() {
        return getSmallWinSize_0(nativeObj);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setCrossSegmentationThreshold(int val)
    //

    public void setCrossSegmentationThreshold(int val) {
        setCrossSegmentationThreshold_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setGlobalMotionRansacThreshold(float val)
    //

    public void setGlobalMotionRansacThreshold(float val) {
        setGlobalMotionRansacThreshold_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setLargeWinSize(int val)
    //

    public void setLargeWinSize(int val) {
        setLargeWinSize_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setMaxIteration(int val)
    //

    public void setMaxIteration(int val) {
        setMaxIteration_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setMaxLevel(int val)
    //

    public void setMaxLevel(int val) {
        setMaxLevel_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setMinEigenValue(float val)
    //

    public void setMinEigenValue(float val) {
        setMinEigenValue_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setNormSigma0(float val)
    //

    public void setNormSigma0(float val) {
        setNormSigma0_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setNormSigma1(float val)
    //

    public void setNormSigma1(float val) {
        setNormSigma1_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setSmallWinSize(int val)
    //

    public void setSmallWinSize(int val) {
        setSmallWinSize_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setSolverType(SolverType val)
    //

    // Unknown type 'SolverType' (I), skipping the function


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setSupportRegionType(SupportRegionType val)
    //

    // Unknown type 'SupportRegionType' (I), skipping the function


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setUseGlobalMotionPrior(bool val)
    //

    public void setUseGlobalMotionPrior(boolean val) {
        setUseGlobalMotionPrior_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setUseIlluminationModel(bool val)
    //

    public void setUseIlluminationModel(boolean val) {
        setUseIlluminationModel_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setUseInitialFlow(bool val)
    //

    public void setUseInitialFlow(boolean val) {
        setUseInitialFlow_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_RLOFOpticalFlowParameter cv::optflow::RLOFOpticalFlowParameter::create()
    private static native long create_0();

    // C++:  bool cv::optflow::RLOFOpticalFlowParameter::getUseGlobalMotionPrior()
    private static native boolean getUseGlobalMotionPrior_0(long nativeObj);

    // C++:  bool cv::optflow::RLOFOpticalFlowParameter::getUseIlluminationModel()
    private static native boolean getUseIlluminationModel_0(long nativeObj);

    // C++:  bool cv::optflow::RLOFOpticalFlowParameter::getUseInitialFlow()
    private static native boolean getUseInitialFlow_0(long nativeObj);

    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getGlobalMotionRansacThreshold()
    private static native float getGlobalMotionRansacThreshold_0(long nativeObj);

    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getMinEigenValue()
    private static native float getMinEigenValue_0(long nativeObj);

    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getNormSigma0()
    private static native float getNormSigma0_0(long nativeObj);

    // C++:  float cv::optflow::RLOFOpticalFlowParameter::getNormSigma1()
    private static native float getNormSigma1_0(long nativeObj);

    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getCrossSegmentationThreshold()
    private static native int getCrossSegmentationThreshold_0(long nativeObj);

    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getLargeWinSize()
    private static native int getLargeWinSize_0(long nativeObj);

    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getMaxIteration()
    private static native int getMaxIteration_0(long nativeObj);

    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getMaxLevel()
    private static native int getMaxLevel_0(long nativeObj);

    // C++:  int cv::optflow::RLOFOpticalFlowParameter::getSmallWinSize()
    private static native int getSmallWinSize_0(long nativeObj);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setCrossSegmentationThreshold(int val)
    private static native void setCrossSegmentationThreshold_0(long nativeObj, int val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setGlobalMotionRansacThreshold(float val)
    private static native void setGlobalMotionRansacThreshold_0(long nativeObj, float val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setLargeWinSize(int val)
    private static native void setLargeWinSize_0(long nativeObj, int val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setMaxIteration(int val)
    private static native void setMaxIteration_0(long nativeObj, int val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setMaxLevel(int val)
    private static native void setMaxLevel_0(long nativeObj, int val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setMinEigenValue(float val)
    private static native void setMinEigenValue_0(long nativeObj, float val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setNormSigma0(float val)
    private static native void setNormSigma0_0(long nativeObj, float val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setNormSigma1(float val)
    private static native void setNormSigma1_0(long nativeObj, float val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setSmallWinSize(int val)
    private static native void setSmallWinSize_0(long nativeObj, int val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setUseGlobalMotionPrior(bool val)
    private static native void setUseGlobalMotionPrior_0(long nativeObj, boolean val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setUseIlluminationModel(bool val)
    private static native void setUseIlluminationModel_0(long nativeObj, boolean val);

    // C++:  void cv::optflow::RLOFOpticalFlowParameter::setUseInitialFlow(bool val)
    private static native void setUseInitialFlow_0(long nativeObj, boolean val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
