//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;

import org.opencv.optflow.RLOFOpticalFlowParameter;
import org.opencv.optflow.SparseRLOFOpticalFlow;
import org.opencv.video.SparseOpticalFlow;

// C++: class SparseRLOFOpticalFlow
/**
 * Class used for calculation sparse optical flow and feature tracking with robust local optical flow (RLOF) algorithms.
 *
 * The RLOF is a fast local optical flow approach described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014
 * and CITE: Senst2016 similar to the pyramidal iterative Lucas-Kanade method as
 * proposed by CITE: Bouguet00. The implementation is derived from optflow::calcOpticalFlowPyrLK().
 *
 * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
 * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014 and CITE: Senst2016.
 *
 * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
 * SEE: optflow::calcOpticalFlowSparseRLOF(), optflow::RLOFOpticalFlowParameter
 */
public class SparseRLOFOpticalFlow extends SparseOpticalFlow {

    protected SparseRLOFOpticalFlow(long addr) { super(addr); }

    // internal usage only
    public static SparseRLOFOpticalFlow __fromPtr__(long addr) { return new SparseRLOFOpticalFlow(addr); }

    //
    // C++:  Ptr_RLOFOpticalFlowParameter cv::optflow::SparseRLOFOpticalFlow::getRLOFOpticalFlowParameter()
    //

    /**
     *  setRLOFOpticalFlowParameter
     * SEE: setRLOFOpticalFlowParameter
     * @return automatically generated
     */
    public RLOFOpticalFlowParameter getRLOFOpticalFlowParameter() {
        return RLOFOpticalFlowParameter.__fromPtr__(getRLOFOpticalFlowParameter_0(nativeObj));
    }


    //
    // C++: static Ptr_SparseRLOFOpticalFlow cv::optflow::SparseRLOFOpticalFlow::create(Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 1.f)
    //

    /**
     * @param rlofParam see setRLOFOpticalFlowParameter
     * @param forwardBackwardThreshold see setForwardBackward
     * @return automatically generated
     */
    public static SparseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold) {
        return SparseRLOFOpticalFlow.__fromPtr__(create_0(rlofParam.getNativeObjAddr(), forwardBackwardThreshold));
    }

    /**
     * @param rlofParam see setRLOFOpticalFlowParameter
     * @return automatically generated
     */
    public static SparseRLOFOpticalFlow create(RLOFOpticalFlowParameter rlofParam) {
        return SparseRLOFOpticalFlow.__fromPtr__(create_1(rlofParam.getNativeObjAddr()));
    }

    /**
     * @return automatically generated
     */
    public static SparseRLOFOpticalFlow create() {
        return SparseRLOFOpticalFlow.__fromPtr__(create_2());
    }


    //
    // C++:  float cv::optflow::SparseRLOFOpticalFlow::getForwardBackward()
    //

    /**
     *  setForwardBackward
     * SEE: setForwardBackward
     * @return automatically generated
     */
    public float getForwardBackward() {
        return getForwardBackward_0(nativeObj);
    }


    //
    // C++:  void cv::optflow::SparseRLOFOpticalFlow::setForwardBackward(float val)
    //

    /**
     * For each feature point a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the status  will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * SEE: setForwardBackward
     * @param val automatically generated
     */
    public void setForwardBackward(float val) {
        setForwardBackward_0(nativeObj, val);
    }


    //
    // C++:  void cv::optflow::SparseRLOFOpticalFlow::setRLOFOpticalFlowParameter(Ptr_RLOFOpticalFlowParameter val)
    //

    /**
     *  DenseRLOFOpticalFlow::setRLOFOpticalFlowParameter
     * @param val automatically generated
     */
    public void setRLOFOpticalFlowParameter(RLOFOpticalFlowParameter val) {
        setRLOFOpticalFlowParameter_0(nativeObj, val.getNativeObjAddr());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  Ptr_RLOFOpticalFlowParameter cv::optflow::SparseRLOFOpticalFlow::getRLOFOpticalFlowParameter()
    private static native long getRLOFOpticalFlowParameter_0(long nativeObj);

    // C++: static Ptr_SparseRLOFOpticalFlow cv::optflow::SparseRLOFOpticalFlow::create(Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 1.f)
    private static native long create_0(long rlofParam_nativeObj, float forwardBackwardThreshold);
    private static native long create_1(long rlofParam_nativeObj);
    private static native long create_2();

    // C++:  float cv::optflow::SparseRLOFOpticalFlow::getForwardBackward()
    private static native float getForwardBackward_0(long nativeObj);

    // C++:  void cv::optflow::SparseRLOFOpticalFlow::setForwardBackward(float val)
    private static native void setForwardBackward_0(long nativeObj, float val);

    // C++:  void cv::optflow::SparseRLOFOpticalFlow::setRLOFOpticalFlowParameter(Ptr_RLOFOpticalFlowParameter val)
    private static native void setRLOFOpticalFlowParameter_0(long nativeObj, long val_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
