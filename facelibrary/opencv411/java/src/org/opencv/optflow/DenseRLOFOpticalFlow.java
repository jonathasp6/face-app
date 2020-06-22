//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;

import org.opencv.core.Size;
import org.opencv.optflow.DenseRLOFOpticalFlow;
import org.opencv.optflow.RLOFOpticalFlowParameter;
import org.opencv.video.DenseOpticalFlow;

// C++: class DenseRLOFOpticalFlow
/**
 * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation
 * scheme.
 *
 * The RLOF is a fast local optical flow approach described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014
 * and CITE: Senst2016 similar to the pyramidal iterative Lucas-Kanade method as
 * proposed by CITE: Bouguet00. The implementation is derived from optflow::calcOpticalFlowPyrLK().
 *
 * The sparse-to-dense interpolation scheme allows for fast computation of dense optical flow using RLOF (see CITE: Geistert2016).
 * For this scheme the following steps are applied:
 * -# motion vector seeded at a regular sampled grid are computed. The sparsity of this grid can be configured with setGridStep
 * -# (optinally) errornous motion vectors are filter based on the forward backward confidence. The threshold can be configured
 * with setForwardBackward. The filter is only applied if the threshold &gt;0 but than the runtime is doubled due to the estimation
 * of the backward flow.
 * -# Vector field interpolation is applied to the motion vector set to obtain a dense vector field.
 *
 * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
 * Parameters have been described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014 and CITE: Senst2016.
 *
 * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1. If the grid size is set to (1,1) and the
 * forward backward threshold &lt;= 0 that the dense optical flow field is purely.
 * computed with the RLOF.
 *
 * SEE: optflow::calcOpticalFlowDenseRLOF(), optflow::RLOFOpticalFlowParameter
 */
public class DenseRLOFOpticalFlow extends DenseOpticalFlow {

    protected DenseRLOFOpticalFlow(long addr) { super(addr); }

    // internal usage only
    public static DenseRLOFOpticalFlow __fromPtr__(long addr) { return new DenseRLOFOpticalFlow(addr); }

    //
    // C++:  InterpolationType cv::optflow::DenseRLOFOpticalFlow::getInterpolation()
    //

    // Return type 'InterpolationType' is not supported, skipping the function


    //
    // C++: static Ptr_DenseRLOFOpticalFlow cv::optflow::DenseRLOFOpticalFlow::create(Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 1.f, Size gridStep = Size(6, 6), InterpolationType interp_type = InterpolationType::INTERP_EPIC, int epicK = 128, float epicSigma = 0.05f, float epicLambda = 999.0f, bool use_post_proc = true, float fgsLambda = 500.0f, float fgsSigma = 1.5f)
    //

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @param epicK see setEPICK
     * @param epicSigma see setEPICSigma
     * @param epicLambda see setEPICLambda
     * @param use_post_proc see setUsePostProc
     * @param fgsLambda see setFgsLambda
     * @param fgsSigma see setFgsSigma
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda, float fgsSigma) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_0(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda, use_post_proc, fgsLambda, fgsSigma));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @param epicK see setEPICK
     * @param epicSigma see setEPICSigma
     * @param epicLambda see setEPICLambda
     * @param use_post_proc see setUsePostProc
     * @param fgsLambda see setFgsLambda
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_1(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda, use_post_proc, fgsLambda));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @param epicK see setEPICK
     * @param epicSigma see setEPICSigma
     * @param epicLambda see setEPICLambda
     * @param use_post_proc see setUsePostProc
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda, boolean use_post_proc) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_2(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda, use_post_proc));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @param epicK see setEPICK
     * @param epicSigma see setEPICSigma
     * @param epicLambda see setEPICLambda
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_3(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @param epicK see setEPICK
     * @param epicSigma see setEPICSigma
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_4(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @param epicK see setEPICK
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_5(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @param gridStep see setGridStep
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_6(rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_8(rlofParam.getNativeObjAddr(), forwardBackwardThreshold));
    }

    /**
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam) {
        return DenseRLOFOpticalFlow.__fromPtr__(create_9(rlofParam.getNativeObjAddr()));
    }

    /**
     * @return automatically generated
     */
    public static DenseRLOFOpticalFlow create() {
        return DenseRLOFOpticalFlow.__fromPtr__(create_10());
    }


    //
    // C++:  Ptr_RLOFOpticalFlowParameter cv::optflow::DenseRLOFOpticalFlow::getRLOFOpticalFlowParameter()
    //

    /**
     *  setRLOFOpticalFlowParameter
     *         SEE: optflow::RLOFOpticalFlowParameter, setRLOFOpticalFlowParameter
     * @return automatically generated
     */
    public RLOFOpticalFlowParameter getRLOFOpticalFlowParameter() {
        return RLOFOpticalFlowParameter.__fromPtr__(getRLOFOpticalFlowParameter_0(nativeObj));
    }


    //
    // C++:  Size cv::optflow::DenseRLOFOpticalFlow::getGridStep()
    //

    /**
     * For each grid point a motion vector is computed. Some motion vectors will be removed due to the forwatd backward
     * threshold (if set &gt;0). The rest will be the base of the vector field interpolation.
     * SEE: getForwardBackward, setGridStep
     * @return automatically generated
     */
    public Size getGridStep() {
        return new Size(getGridStep_0(nativeObj));
    }


    //
    // C++:  bool cv::optflow::DenseRLOFOpticalFlow::getUsePostProc()
    //

    /**
     *  setUsePostProc
     * SEE: ximgproc::fastGlobalSmootherFilter, setUsePostProc
     * @return automatically generated
     */
    public boolean getUsePostProc() {
        return getUsePostProc_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getEPICLambda()
    //

    /**
     * Lambda is a parameter defining the weight of the edge-aware term in geodesic distance,
     * should be in the range of 0 to 1000.
     * SEE: ximgproc::EdgeAwareInterpolator, setEPICSigma
     * @return automatically generated
     */
    public float getEPICLambda() {
        return getEPICLambda_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getEPICSigma()
    //

    /**
     * Sigma is a parameter defining how fast the weights decrease in the locally-weighted affine
     * fitting. Higher values can help preserve fine details, lower values can help to get rid of noise in the
     * output flow.
     * SEE: ximgproc::EdgeAwareInterpolator, setEPICSigma
     * @return automatically generated
     */
    public float getEPICSigma() {
        return getEPICSigma_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getFgsLambda()
    //

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     * SEE: ximgproc::EdgeAwareInterpolator, setFgsLambda
     * @return automatically generated
     */
    public float getFgsLambda() {
        return getFgsLambda_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getFgsSigma()
    //

    /**
     * Sets the respective fastGlobalSmootherFilter() parameter.
     * SEE: ximgproc::EdgeAwareInterpolator, ximgproc::fastGlobalSmootherFilter, setFgsSigma
     * @return automatically generated
     */
    public float getFgsSigma() {
        return getFgsSigma_0(nativeObj);
    }


    //
    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getForwardBackward()
    //

    /**
     *  setForwardBackward
     *         SEE: setForwardBackward
     * @return automatically generated
     */
    public float getForwardBackward() {
        return getForwardBackward_0(nativeObj);
    }


    //
    // C++:  int cv::optflow::DenseRLOFOpticalFlow::getEPICK()
    //

    /**
     * K is a number of nearest-neighbor matches considered, when fitting a locally affine
     * model. Usually it should be around 128. However, lower values would make the interpolation noticeably faster.
     * SEE: ximgproc::EdgeAwareInterpolator,  setEPICK
     * @return automatically generated
     */
    public int getEPICK() {
        return getEPICK_0(nativeObj);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setEPICK(int val)
    //

    /**
     *  getEPICK
     * SEE: ximgproc::EdgeAwareInterpolator, getEPICK
     * @param val automatically generated
     */
    public void setEPICK(int val) {
        setEPICK_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setEPICLambda(float val)
    //

    /**
     *  getEPICLambda
     * SEE: ximgproc::EdgeAwareInterpolator, getEPICLambda
     * @param val automatically generated
     */
    public void setEPICLambda(float val) {
        setEPICLambda_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setEPICSigma(float val)
    //

    /**
     *  getEPICSigma
     * SEE: ximgproc::EdgeAwareInterpolator, getEPICSigma
     * @param val automatically generated
     */
    public void setEPICSigma(float val) {
        setEPICSigma_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setFgsLambda(float val)
    //

    /**
     *  getFgsLambda
     * SEE: ximgproc::EdgeAwareInterpolator, ximgproc::fastGlobalSmootherFilter, getFgsLambda
     * @param val automatically generated
     */
    public void setFgsLambda(float val) {
        setFgsLambda_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setFgsSigma(float val)
    //

    /**
     *  getFgsSigma
     * SEE: ximgproc::EdgeAwareInterpolator, ximgproc::fastGlobalSmootherFilter, getFgsSigma
     * @param val automatically generated
     */
    public void setFgsSigma(float val) {
        setFgsSigma_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setForwardBackward(float val)
    //

    /**
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * SEE: getForwardBackward, setGridStep
     * @param val automatically generated
     */
    public void setForwardBackward(float val) {
        setForwardBackward_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setGridStep(Size val)
    //

    /**
     *  getGridStep
     * SEE: getGridStep
     * @param val automatically generated
     */
    public void setGridStep(Size val) {
        setGridStep_0(nativeObj, val.width, val.height);
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setInterpolation(InterpolationType val)
    //

    // Unknown type 'InterpolationType' (I), skipping the function


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setRLOFOpticalFlowParameter(Ptr_RLOFOpticalFlowParameter val)
    //

    /**
     * SEE: optflow::RLOFOpticalFlowParameter, getRLOFOpticalFlowParameter
     * @param val automatically generated
     */
    public void setRLOFOpticalFlowParameter(RLOFOpticalFlowParameter val) {
        setRLOFOpticalFlowParameter_0(nativeObj, val.getNativeObjAddr());
    }


    //
    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setUsePostProc(bool val)
    //

    /**
     * SEE: getUsePostProc
     * @param val automatically generated
     */
    public void setUsePostProc(boolean val) {
        setUsePostProc_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DenseRLOFOpticalFlow cv::optflow::DenseRLOFOpticalFlow::create(Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 1.f, Size gridStep = Size(6, 6), InterpolationType interp_type = InterpolationType::INTERP_EPIC, int epicK = 128, float epicSigma = 0.05f, float epicLambda = 999.0f, bool use_post_proc = true, float fgsLambda = 500.0f, float fgsSigma = 1.5f)
    private static native long create_0(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda, float fgsSigma);
    private static native long create_1(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda);
    private static native long create_2(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda, boolean use_post_proc);
    private static native long create_3(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda);
    private static native long create_4(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma);
    private static native long create_5(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK);
    private static native long create_6(long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height);
    private static native long create_8(long rlofParam_nativeObj, float forwardBackwardThreshold);
    private static native long create_9(long rlofParam_nativeObj);
    private static native long create_10();

    // C++:  Ptr_RLOFOpticalFlowParameter cv::optflow::DenseRLOFOpticalFlow::getRLOFOpticalFlowParameter()
    private static native long getRLOFOpticalFlowParameter_0(long nativeObj);

    // C++:  Size cv::optflow::DenseRLOFOpticalFlow::getGridStep()
    private static native double[] getGridStep_0(long nativeObj);

    // C++:  bool cv::optflow::DenseRLOFOpticalFlow::getUsePostProc()
    private static native boolean getUsePostProc_0(long nativeObj);

    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getEPICLambda()
    private static native float getEPICLambda_0(long nativeObj);

    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getEPICSigma()
    private static native float getEPICSigma_0(long nativeObj);

    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getFgsLambda()
    private static native float getFgsLambda_0(long nativeObj);

    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getFgsSigma()
    private static native float getFgsSigma_0(long nativeObj);

    // C++:  float cv::optflow::DenseRLOFOpticalFlow::getForwardBackward()
    private static native float getForwardBackward_0(long nativeObj);

    // C++:  int cv::optflow::DenseRLOFOpticalFlow::getEPICK()
    private static native int getEPICK_0(long nativeObj);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setEPICK(int val)
    private static native void setEPICK_0(long nativeObj, int val);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setEPICLambda(float val)
    private static native void setEPICLambda_0(long nativeObj, float val);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setEPICSigma(float val)
    private static native void setEPICSigma_0(long nativeObj, float val);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setFgsLambda(float val)
    private static native void setFgsLambda_0(long nativeObj, float val);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setFgsSigma(float val)
    private static native void setFgsSigma_0(long nativeObj, float val);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setForwardBackward(float val)
    private static native void setForwardBackward_0(long nativeObj, float val);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setGridStep(Size val)
    private static native void setGridStep_0(long nativeObj, double val_width, double val_height);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setRLOFOpticalFlowParameter(Ptr_RLOFOpticalFlowParameter val)
    private static native void setRLOFOpticalFlowParameter_0(long nativeObj, long val_nativeObj);

    // C++:  void cv::optflow::DenseRLOFOpticalFlow::setUsePostProc(bool val)
    private static native void setUsePostProc_0(long nativeObj, boolean val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
