//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Size;
import org.opencv.optflow.DualTVL1OpticalFlow;
import org.opencv.optflow.RLOFOpticalFlowParameter;
import org.opencv.utils.Converters;
import org.opencv.video.DenseOpticalFlow;
import org.opencv.video.SparseOpticalFlow;

// C++: class Optflow

public class Optflow {

    // C++: enum SolverType
    public static final int
            ST_STANDART = 0,
            ST_BILINEAR = 1;


    // C++: enum InterpolationType
    public static final int
            INTERP_GEO = 0,
            INTERP_EPIC = 1;


    // C++: enum SupportRegionType
    public static final int
            SR_FIXED = 0,
            SR_CROSS = 1;


    // C++: enum GPCDescType
    public static final int
            GPC_DESCRIPTOR_DCT = 0,
            GPC_DESCRIPTOR_WHT = 0+1;


    //
    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_DeepFlow()
    //

    /**
     * DeepFlow optical flow algorithm implementation.
     *
     * The class implements the DeepFlow optical flow algorithm described in CITE: Weinzaepfel2013 . See
     * also &lt;http://lear.inrialpes.fr/src/deepmatching/&gt; .
     * Parameters - class fields - that may be modified after creating a class instance:
     * <ul>
     *   <li>
     *    member float alpha
     * Smoothness assumption weight
     *   </li>
     *   <li>
     *    member float delta
     * Color constancy assumption weight
     *   </li>
     *   <li>
     *    member float gamma
     * Gradient constancy weight
     *   </li>
     *   <li>
     *    member float sigma
     * Gaussian smoothing parameter
     *   </li>
     *   <li>
     *    member int minSize
     * Minimal dimension of an image in the pyramid (next, smaller images in the pyramid are generated
     * until one of the dimensions reaches this size)
     *   </li>
     *   <li>
     *    member float downscaleFactor
     * Scaling factor in the image pyramid (must be &lt; 1)
     *   </li>
     *   <li>
     *    member int fixedPointIterations
     * How many iterations on each level of the pyramid
     *   </li>
     *   <li>
     *    member int sorIterations
     * Iterations of Succesive Over-Relaxation (solver)
     *   </li>
     *   <li>
     *    member float omega
     * Relaxation factor in SOR
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static DenseOpticalFlow createOptFlow_DeepFlow() {
        return DenseOpticalFlow.__fromPtr__(createOptFlow_DeepFlow_0());
    }


    //
    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_DenseRLOF()
    //

    public static DenseOpticalFlow createOptFlow_DenseRLOF() {
        return DenseOpticalFlow.__fromPtr__(createOptFlow_DenseRLOF_0());
    }


    //
    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_Farneback()
    //

    public static DenseOpticalFlow createOptFlow_Farneback() {
        return DenseOpticalFlow.__fromPtr__(createOptFlow_Farneback_0());
    }


    //
    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_PCAFlow()
    //

    /**
     * Creates an instance of PCAFlow
     * @return automatically generated
     */
    public static DenseOpticalFlow createOptFlow_PCAFlow() {
        return DenseOpticalFlow.__fromPtr__(createOptFlow_PCAFlow_0());
    }


    //
    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_SimpleFlow()
    //

    public static DenseOpticalFlow createOptFlow_SimpleFlow() {
        return DenseOpticalFlow.__fromPtr__(createOptFlow_SimpleFlow_0());
    }


    //
    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_SparseToDense()
    //

    public static DenseOpticalFlow createOptFlow_SparseToDense() {
        return DenseOpticalFlow.__fromPtr__(createOptFlow_SparseToDense_0());
    }


    //
    // C++:  Ptr_DualTVL1OpticalFlow cv::optflow::createOptFlow_DualTVL1()
    //

    /**
     * Creates instance of cv::DenseOpticalFlow
     * @return automatically generated
     */
    public static DualTVL1OpticalFlow createOptFlow_DualTVL1() {
        return DualTVL1OpticalFlow.__fromPtr__(createOptFlow_DualTVL1_0());
    }


    //
    // C++:  Ptr_SparseOpticalFlow cv::optflow::createOptFlow_SparseRLOF()
    //

    public static SparseOpticalFlow createOptFlow_SparseRLOF() {
        return SparseOpticalFlow.__fromPtr__(createOptFlow_SparseRLOF_0());
    }


    //
    // C++:  double cv::motempl::calcGlobalOrientation(Mat orientation, Mat mask, Mat mhi, double timestamp, double duration)
    //

    /**
     * Calculates a global motion orientation in a selected region.
     *
     * @param orientation Motion gradient orientation image calculated by the function calcMotionGradient
     * @param mask Mask image. It may be a conjunction of a valid gradient mask, also calculated by
     * calcMotionGradient , and the mask of a region whose direction needs to be calculated.
     * @param mhi Motion history image calculated by updateMotionHistory .
     * @param timestamp Timestamp passed to updateMotionHistory .
     * @param duration Maximum duration of a motion track in milliseconds, passed to updateMotionHistory
     *
     * The function calculates an average motion direction in the selected region and returns the angle
     * between 0 degrees and 360 degrees. The average direction is computed from the weighted orientation
     * histogram, where a recent motion has a larger weight and the motion occurred in the past has a
     * smaller weight, as recorded in mhi .
     * @return automatically generated
     */
    public static double calcGlobalOrientation(Mat orientation, Mat mask, Mat mhi, double timestamp, double duration) {
        return calcGlobalOrientation_0(orientation.nativeObj, mask.nativeObj, mhi.nativeObj, timestamp, duration);
    }


    //
    // C++:  void cv::motempl::calcMotionGradient(Mat mhi, Mat& mask, Mat& orientation, double delta1, double delta2, int apertureSize = 3)
    //

    /**
     * Calculates a gradient orientation of a motion history image.
     *
     * @param mhi Motion history single-channel floating-point image.
     * @param mask Output mask image that has the type CV_8UC1 and the same size as mhi . Its non-zero
     * elements mark pixels where the motion gradient data is correct.
     * @param orientation Output motion gradient orientation image that has the same type and the same
     * size as mhi . Each pixel of the image is a motion orientation, from 0 to 360 degrees.
     * @param delta1 Minimal (or maximal) allowed difference between mhi values within a pixel
     * neighborhood.
     * @param delta2 Maximal (or minimal) allowed difference between mhi values within a pixel
     * neighborhood. That is, the function finds the minimum ( \(m(x,y)\) ) and maximum ( \(M(x,y)\) ) mhi
     * values over \(3 \times 3\) neighborhood of each pixel and marks the motion orientation at \((x, y)\)
     * as valid only if
     * \(\min ( \texttt{delta1}  ,  \texttt{delta2}  )  \le  M(x,y)-m(x,y)  \le   \max ( \texttt{delta1}  , \texttt{delta2} ).\)
     * @param apertureSize Aperture size of the Sobel operator.
     *
     * The function calculates a gradient orientation at each pixel \((x, y)\) as:
     *
     * \(\texttt{orientation} (x,y)= \arctan{\frac{d\texttt{mhi}/dy}{d\texttt{mhi}/dx}}\)
     *
     * In fact, fastAtan2 and phase are used so that the computed angle is measured in degrees and covers
     * the full range 0..360. Also, the mask is filled to indicate pixels where the computed angle is
     * valid.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       (Python) An example on how to perform a motion template technique can be found at
     *         opencv_source_code/samples/python2/motempl.py
     *   </li>
     * </ul>
     */
    public static void calcMotionGradient(Mat mhi, Mat mask, Mat orientation, double delta1, double delta2, int apertureSize) {
        calcMotionGradient_0(mhi.nativeObj, mask.nativeObj, orientation.nativeObj, delta1, delta2, apertureSize);
    }

    /**
     * Calculates a gradient orientation of a motion history image.
     *
     * @param mhi Motion history single-channel floating-point image.
     * @param mask Output mask image that has the type CV_8UC1 and the same size as mhi . Its non-zero
     * elements mark pixels where the motion gradient data is correct.
     * @param orientation Output motion gradient orientation image that has the same type and the same
     * size as mhi . Each pixel of the image is a motion orientation, from 0 to 360 degrees.
     * @param delta1 Minimal (or maximal) allowed difference between mhi values within a pixel
     * neighborhood.
     * @param delta2 Maximal (or minimal) allowed difference between mhi values within a pixel
     * neighborhood. That is, the function finds the minimum ( \(m(x,y)\) ) and maximum ( \(M(x,y)\) ) mhi
     * values over \(3 \times 3\) neighborhood of each pixel and marks the motion orientation at \((x, y)\)
     * as valid only if
     * \(\min ( \texttt{delta1}  ,  \texttt{delta2}  )  \le  M(x,y)-m(x,y)  \le   \max ( \texttt{delta1}  , \texttt{delta2} ).\)
     *
     * The function calculates a gradient orientation at each pixel \((x, y)\) as:
     *
     * \(\texttt{orientation} (x,y)= \arctan{\frac{d\texttt{mhi}/dy}{d\texttt{mhi}/dx}}\)
     *
     * In fact, fastAtan2 and phase are used so that the computed angle is measured in degrees and covers
     * the full range 0..360. Also, the mask is filled to indicate pixels where the computed angle is
     * valid.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       (Python) An example on how to perform a motion template technique can be found at
     *         opencv_source_code/samples/python2/motempl.py
     *   </li>
     * </ul>
     */
    public static void calcMotionGradient(Mat mhi, Mat mask, Mat orientation, double delta1, double delta2) {
        calcMotionGradient_1(mhi.nativeObj, mask.nativeObj, orientation.nativeObj, delta1, delta2);
    }


    //
    // C++:  void cv::motempl::segmentMotion(Mat mhi, Mat& segmask, vector_Rect& boundingRects, double timestamp, double segThresh)
    //

    /**
     * Splits a motion history image into a few parts corresponding to separate independent motions (for
     * example, left hand, right hand).
     *
     * @param mhi Motion history image.
     * @param segmask Image where the found mask should be stored, single-channel, 32-bit floating-point.
     * @param boundingRects Vector containing ROIs of motion connected components.
     * @param timestamp Current time in milliseconds or other units.
     * @param segThresh Segmentation threshold that is recommended to be equal to the interval between
     * motion history "steps" or greater.
     *
     * The function finds all of the motion segments and marks them in segmask with individual values
     * (1,2,...). It also computes a vector with ROIs of motion connected components. After that the motion
     * direction for every component can be calculated with calcGlobalOrientation using the extracted mask
     * of the particular component.
     */
    public static void segmentMotion(Mat mhi, Mat segmask, MatOfRect boundingRects, double timestamp, double segThresh) {
        Mat boundingRects_mat = boundingRects;
        segmentMotion_0(mhi.nativeObj, segmask.nativeObj, boundingRects_mat.nativeObj, timestamp, segThresh);
    }


    //
    // C++:  void cv::motempl::updateMotionHistory(Mat silhouette, Mat& mhi, double timestamp, double duration)
    //

    /**
     * Updates the motion history image by a moving silhouette.
     *
     * @param silhouette Silhouette mask that has non-zero pixels where the motion occurs.
     * @param mhi Motion history image that is updated by the function (single-channel, 32-bit
     * floating-point).
     * @param timestamp Current time in milliseconds or other units.
     * @param duration Maximal duration of the motion track in the same units as timestamp .
     *
     * The function updates the motion history image as follows:
     *
     * \(\texttt{mhi} (x,y)= \forkthree{\texttt{timestamp}}{if \(\texttt{silhouette}(x,y) \ne 0\)}{0}{if \(\texttt{silhouette}(x,y) = 0\) and \(\texttt{mhi} &lt; (\texttt{timestamp} - \texttt{duration})\)}{\texttt{mhi}(x,y)}{otherwise}\)
     *
     * That is, MHI pixels where the motion occurs are set to the current timestamp , while the pixels
     * where the motion happened last time a long time ago are cleared.
     *
     * The function, together with calcMotionGradient and calcGlobalOrientation , implements a motion
     * templates technique described in CITE: Davis97 and CITE: Bradski00 .
     */
    public static void updateMotionHistory(Mat silhouette, Mat mhi, double timestamp, double duration) {
        updateMotionHistory_0(silhouette.nativeObj, mhi.nativeObj, timestamp, duration);
    }


    //
    // C++:  void cv::optflow::calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat& flow, Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 0, Size gridStep = Size(6, 6), InterpolationType interp_type = InterpolationType::INTERP_EPIC, int epicK = 128, float epicSigma = 0.05f, float epicLambda = 100.f, bool use_post_proc = true, float fgsLambda = 500.0f, float fgsSigma = 1.5f)
    //

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     * @param epicK see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicSigma see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicLambda see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param use_post_proc enables ximgproc::fastGlobalSmootherFilter() parameter.
     * @param fgsLambda sets the respective ximgproc::fastGlobalSmootherFilter() parameter.
     * @param fgsSigma sets the respective ximgproc::fastGlobalSmootherFilter() parameter.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda, float fgsSigma) {
        calcOpticalFlowDenseRLOF_0(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda, use_post_proc, fgsLambda, fgsSigma);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     * @param epicK see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicSigma see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicLambda see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param use_post_proc enables ximgproc::fastGlobalSmootherFilter() parameter.
     * @param fgsLambda sets the respective ximgproc::fastGlobalSmootherFilter() parameter.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda) {
        calcOpticalFlowDenseRLOF_1(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda, use_post_proc, fgsLambda);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     * @param epicK see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicSigma see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicLambda see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param use_post_proc enables ximgproc::fastGlobalSmootherFilter() parameter.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda, boolean use_post_proc) {
        calcOpticalFlowDenseRLOF_2(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda, use_post_proc);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     * @param epicK see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicSigma see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicLambda see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma, float epicLambda) {
        calcOpticalFlowDenseRLOF_3(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma, epicLambda);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     * @param epicK see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     * @param epicSigma see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK, float epicSigma) {
        calcOpticalFlowDenseRLOF_4(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK, epicSigma);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     * @param epicK see ximgproc::EdgeAwareInterpolator() sets the respective parameter.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep, int epicK) {
        calcOpticalFlowDenseRLOF_5(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height, epicK);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * @param gridStep Size of the grid to spawn the motion vectors. For each grid point a motion vector is computed.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold, Size gridStep) {
        calcOpticalFlowDenseRLOF_6(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold, gridStep.width, gridStep.height);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold) {
        calcOpticalFlowDenseRLOF_8(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold);
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow, RLOFOpticalFlowParameter rlofParam) {
        calcOpticalFlowDenseRLOF_9(I0.nativeObj, I1.nativeObj, flow.nativeObj, rlofParam.getNativeObjAddr());
    }

    /**
     * Fast dense optical flow computation based on robust local optical flow (RLOF) algorithms and sparse-to-dense interpolation scheme.
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
     * @param I0 first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param I1 second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param flow computed flow image that has the same size as I0 and type CV_32FC2.
     * For each grid point \( \mathbf{x} \) a motion vector \( d_{I0,I1}(\mathbf{x}) \) is computed.
     * If the forward backward error \( EP_{FB} = || d_{I0,I1} + d_{I1,I0} || \)
     * is larger than threshold given by this function then the motion vector will not be used by the following
     * vector field interpolation. \( d_{I1,I0} \) denotes the backward flow. Note, the forward backward test
     * will only be applied if the threshold &gt; 0. This may results into a doubled runtime for the motion estimation.
     * Some motion vectors will be removed due to the forwatd backward threshold (if set &gt;0). The rest will be the
     * base of the vector field interpolation.
     * supported:
     * - <b>INTERP_GEO</b> applies the fast geodesic interpolation, see CITE: Geistert2016.
     * - <b>INTERP_EPIC_RESIDUAL</b> applies the edge-preserving interpolation, see CITE: Revaud2015,Geistert2016.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014, CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     * <b>Note:</b> If the grid size is set to (1,1) and the forward backward threshold &lt;= 0 that the dense optical flow field is purely
     * computed with the RLOF.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * SEE: optflow::DenseRLOFOpticalFlow, optflow::RLOFOpticalFlowParameter
     */
    public static void calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat flow) {
        calcOpticalFlowDenseRLOF_10(I0.nativeObj, I1.nativeObj, flow.nativeObj);
    }


    //
    // C++:  void cv::optflow::calcOpticalFlowSF(Mat from, Mat to, Mat& flow, int layers, int averaging_block_size, int max_flow, double sigma_dist, double sigma_color, int postprocess_window, double sigma_dist_fix, double sigma_color_fix, double occ_thr, int upscale_averaging_radius, double upscale_sigma_dist, double upscale_sigma_color, double speed_up_thr)
    //

    /**
     * Calculate an optical flow using "SimpleFlow" algorithm.
     *
     * @param from First 8-bit 3-channel image.
     * @param to Second 8-bit 3-channel image of the same size as prev
     * @param flow computed flow image that has the same size as prev and type CV_32FC2
     * @param layers Number of layers
     * @param averaging_block_size Size of block through which we sum up when calculate cost function
     * for pixel
     * @param max_flow maximal flow that we search at each level
     * @param sigma_dist vector smooth spatial sigma parameter
     * @param sigma_color vector smooth color sigma parameter
     * @param postprocess_window window size for postprocess cross bilateral filter
     * @param sigma_dist_fix spatial sigma for postprocess cross bilateralf filter
     * @param sigma_color_fix color sigma for postprocess cross bilateral filter
     * @param occ_thr threshold for detecting occlusions
     * @param upscale_averaging_radius window size for bilateral upscale operation
     * @param upscale_sigma_dist spatial sigma for bilateral upscale operation
     * @param upscale_sigma_color color sigma for bilateral upscale operation
     * @param speed_up_thr threshold to detect point with irregular flow - where flow should be
     * recalculated after upscale
     *
     * See CITE: Tao2012 . And site of project - &lt;http://graphics.berkeley.edu/papers/Tao-SAN-2012-05/&gt;.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example using the simpleFlow algorithm can be found at samples/simpleflow_demo.cpp
     *   </li>
     * </ul>
     */
    public static void calcOpticalFlowSF(Mat from, Mat to, Mat flow, int layers, int averaging_block_size, int max_flow, double sigma_dist, double sigma_color, int postprocess_window, double sigma_dist_fix, double sigma_color_fix, double occ_thr, int upscale_averaging_radius, double upscale_sigma_dist, double upscale_sigma_color, double speed_up_thr) {
        calcOpticalFlowSF_0(from.nativeObj, to.nativeObj, flow.nativeObj, layers, averaging_block_size, max_flow, sigma_dist, sigma_color, postprocess_window, sigma_dist_fix, sigma_color_fix, occ_thr, upscale_averaging_radius, upscale_sigma_dist, upscale_sigma_color, speed_up_thr);
    }


    //
    // C++:  void cv::optflow::calcOpticalFlowSF(Mat from, Mat to, Mat& flow, int layers, int averaging_block_size, int max_flow)
    //

    public static void calcOpticalFlowSF(Mat from, Mat to, Mat flow, int layers, int averaging_block_size, int max_flow) {
        calcOpticalFlowSF_1(from.nativeObj, to.nativeObj, flow.nativeObj, layers, averaging_block_size, max_flow);
    }


    //
    // C++:  void cv::optflow::calcOpticalFlowSparseRLOF(Mat prevImg, Mat nextImg, Mat prevPts, Mat& nextPts, Mat& status, Mat& err, Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 0)
    //

    /**
     * Calculates fast optical flow for a sparse feature set using the robust local optical flow (RLOF) similar
     * to optflow::calcOpticalFlowPyrLK().
     *
     * The RLOF is a fast local optical flow approach described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014
     * and CITE: Senst2016 similar to the pyramidal iterative Lucas-Kanade method as
     * proposed by CITE: Bouguet00. The implementation is derived from optflow::calcOpticalFlowPyrLK().
     *
     * @param prevImg first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param nextImg second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param prevPts vector of 2D points for which the flow needs to be found; point coordinates must be single-precision
     * floating-point numbers.
     * @param nextPts output vector of 2D points (with single-precision floating-point coordinates) containing the calculated
     * new positions of input features in the second image; when optflow::RLOFOpticalFlowParameter::useInitialFlow variable is true  the vector must
     * have the same size as in the input and contain the initialization point correspondences.
     * @param status output status vector (of unsigned chars); each element of the vector is set to 1 if the flow for the
     * corresponding features has passed the forward backward check.
     * @param err output vector of errors; each element of the vector is set to the forward backward error for the corresponding feature.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     * @param forwardBackwardThreshold Threshold for the forward backward confidence check. If forewardBackwardThreshold &lt;=0 the forward
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014 and CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     */
    public static void calcOpticalFlowSparseRLOF(Mat prevImg, Mat nextImg, Mat prevPts, Mat nextPts, Mat status, Mat err, RLOFOpticalFlowParameter rlofParam, float forwardBackwardThreshold) {
        calcOpticalFlowSparseRLOF_0(prevImg.nativeObj, nextImg.nativeObj, prevPts.nativeObj, nextPts.nativeObj, status.nativeObj, err.nativeObj, rlofParam.getNativeObjAddr(), forwardBackwardThreshold);
    }

    /**
     * Calculates fast optical flow for a sparse feature set using the robust local optical flow (RLOF) similar
     * to optflow::calcOpticalFlowPyrLK().
     *
     * The RLOF is a fast local optical flow approach described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014
     * and CITE: Senst2016 similar to the pyramidal iterative Lucas-Kanade method as
     * proposed by CITE: Bouguet00. The implementation is derived from optflow::calcOpticalFlowPyrLK().
     *
     * @param prevImg first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param nextImg second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param prevPts vector of 2D points for which the flow needs to be found; point coordinates must be single-precision
     * floating-point numbers.
     * @param nextPts output vector of 2D points (with single-precision floating-point coordinates) containing the calculated
     * new positions of input features in the second image; when optflow::RLOFOpticalFlowParameter::useInitialFlow variable is true  the vector must
     * have the same size as in the input and contain the initialization point correspondences.
     * @param status output status vector (of unsigned chars); each element of the vector is set to 1 if the flow for the
     * corresponding features has passed the forward backward check.
     * @param err output vector of errors; each element of the vector is set to the forward backward error for the corresponding feature.
     * @param rlofParam see optflow::RLOFOpticalFlowParameter
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014 and CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     */
    public static void calcOpticalFlowSparseRLOF(Mat prevImg, Mat nextImg, Mat prevPts, Mat nextPts, Mat status, Mat err, RLOFOpticalFlowParameter rlofParam) {
        calcOpticalFlowSparseRLOF_1(prevImg.nativeObj, nextImg.nativeObj, prevPts.nativeObj, nextPts.nativeObj, status.nativeObj, err.nativeObj, rlofParam.getNativeObjAddr());
    }

    /**
     * Calculates fast optical flow for a sparse feature set using the robust local optical flow (RLOF) similar
     * to optflow::calcOpticalFlowPyrLK().
     *
     * The RLOF is a fast local optical flow approach described in CITE: Senst2012 CITE: Senst2013 CITE: Senst2014
     * and CITE: Senst2016 similar to the pyramidal iterative Lucas-Kanade method as
     * proposed by CITE: Bouguet00. The implementation is derived from optflow::calcOpticalFlowPyrLK().
     *
     * @param prevImg first 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param nextImg second 8-bit input image. If The cross-based RLOF is used (by selecting optflow::RLOFOpticalFlowParameter::supportRegionType
     * = SupportRegionType::SR_CROSS) image has to be a 8-bit 3 channel image.
     * @param prevPts vector of 2D points for which the flow needs to be found; point coordinates must be single-precision
     * floating-point numbers.
     * @param nextPts output vector of 2D points (with single-precision floating-point coordinates) containing the calculated
     * new positions of input features in the second image; when optflow::RLOFOpticalFlowParameter::useInitialFlow variable is true  the vector must
     * have the same size as in the input and contain the initialization point correspondences.
     * @param status output status vector (of unsigned chars); each element of the vector is set to 1 if the flow for the
     * corresponding features has passed the forward backward check.
     * @param err output vector of errors; each element of the vector is set to the forward backward error for the corresponding feature.
     *
     * <b>Note:</b> SIMD parallelization is only available when compiling with SSE4.1.
     *
     * Parameters have been described in CITE: Senst2012, CITE: Senst2013, CITE: Senst2014 and CITE: Senst2016.
     * For the RLOF configuration see optflow::RLOFOpticalFlowParameter for further details.
     */
    public static void calcOpticalFlowSparseRLOF(Mat prevImg, Mat nextImg, Mat prevPts, Mat nextPts, Mat status, Mat err) {
        calcOpticalFlowSparseRLOF_2(prevImg.nativeObj, nextImg.nativeObj, prevPts.nativeObj, nextPts.nativeObj, status.nativeObj, err.nativeObj);
    }


    //
    // C++:  void cv::optflow::calcOpticalFlowSparseToDense(Mat from, Mat to, Mat& flow, int grid_step = 8, int k = 128, float sigma = 0.05f, bool use_post_proc = true, float fgs_lambda = 500.0f, float fgs_sigma = 1.5f)
    //

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     * @param grid_step stride used in sparse match computation. Lower values usually
     *        result in higher quality but slow down the algorithm.
     * @param k number of nearest-neighbor matches considered, when fitting a locally affine
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     * @param sigma parameter defining how fast the weights decrease in the locally-weighted affine
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     * @param use_post_proc defines whether the ximgproc::fastGlobalSmootherFilter() is used
     *        for post-processing after interpolation
     * @param fgs_lambda see the respective parameter of the ximgproc::fastGlobalSmootherFilter()
     * @param fgs_sigma  see the respective parameter of the ximgproc::fastGlobalSmootherFilter()
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow, int grid_step, int k, float sigma, boolean use_post_proc, float fgs_lambda, float fgs_sigma) {
        calcOpticalFlowSparseToDense_0(from.nativeObj, to.nativeObj, flow.nativeObj, grid_step, k, sigma, use_post_proc, fgs_lambda, fgs_sigma);
    }

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     * @param grid_step stride used in sparse match computation. Lower values usually
     *        result in higher quality but slow down the algorithm.
     * @param k number of nearest-neighbor matches considered, when fitting a locally affine
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     * @param sigma parameter defining how fast the weights decrease in the locally-weighted affine
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     * @param use_post_proc defines whether the ximgproc::fastGlobalSmootherFilter() is used
     *        for post-processing after interpolation
     * @param fgs_lambda see the respective parameter of the ximgproc::fastGlobalSmootherFilter()
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow, int grid_step, int k, float sigma, boolean use_post_proc, float fgs_lambda) {
        calcOpticalFlowSparseToDense_1(from.nativeObj, to.nativeObj, flow.nativeObj, grid_step, k, sigma, use_post_proc, fgs_lambda);
    }

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     * @param grid_step stride used in sparse match computation. Lower values usually
     *        result in higher quality but slow down the algorithm.
     * @param k number of nearest-neighbor matches considered, when fitting a locally affine
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     * @param sigma parameter defining how fast the weights decrease in the locally-weighted affine
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     * @param use_post_proc defines whether the ximgproc::fastGlobalSmootherFilter() is used
     *        for post-processing after interpolation
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow, int grid_step, int k, float sigma, boolean use_post_proc) {
        calcOpticalFlowSparseToDense_2(from.nativeObj, to.nativeObj, flow.nativeObj, grid_step, k, sigma, use_post_proc);
    }

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     * @param grid_step stride used in sparse match computation. Lower values usually
     *        result in higher quality but slow down the algorithm.
     * @param k number of nearest-neighbor matches considered, when fitting a locally affine
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     * @param sigma parameter defining how fast the weights decrease in the locally-weighted affine
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     *        for post-processing after interpolation
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow, int grid_step, int k, float sigma) {
        calcOpticalFlowSparseToDense_3(from.nativeObj, to.nativeObj, flow.nativeObj, grid_step, k, sigma);
    }

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     * @param grid_step stride used in sparse match computation. Lower values usually
     *        result in higher quality but slow down the algorithm.
     * @param k number of nearest-neighbor matches considered, when fitting a locally affine
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     *        for post-processing after interpolation
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow, int grid_step, int k) {
        calcOpticalFlowSparseToDense_4(from.nativeObj, to.nativeObj, flow.nativeObj, grid_step, k);
    }

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     * @param grid_step stride used in sparse match computation. Lower values usually
     *        result in higher quality but slow down the algorithm.
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     *        for post-processing after interpolation
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow, int grid_step) {
        calcOpticalFlowSparseToDense_5(from.nativeObj, to.nativeObj, flow.nativeObj, grid_step);
    }

    /**
     * Fast dense optical flow based on PyrLK sparse matches interpolation.
     *
     * @param from first 8-bit 3-channel or 1-channel image.
     * @param to  second 8-bit 3-channel or 1-channel image of the same size as from
     * @param flow computed flow image that has the same size as from and CV_32FC2 type
     *        result in higher quality but slow down the algorithm.
     *        model. Lower values can make the algorithm noticeably faster at the cost of
     *        some quality degradation.
     *        fitting. Higher values can help preserve fine details, lower values can help to get rid
     *        of the noise in the output flow.
     *        for post-processing after interpolation
     */
    public static void calcOpticalFlowSparseToDense(Mat from, Mat to, Mat flow) {
        calcOpticalFlowSparseToDense_6(from.nativeObj, to.nativeObj, flow.nativeObj);
    }




    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_DeepFlow()
    private static native long createOptFlow_DeepFlow_0();

    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_DenseRLOF()
    private static native long createOptFlow_DenseRLOF_0();

    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_Farneback()
    private static native long createOptFlow_Farneback_0();

    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_PCAFlow()
    private static native long createOptFlow_PCAFlow_0();

    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_SimpleFlow()
    private static native long createOptFlow_SimpleFlow_0();

    // C++:  Ptr_DenseOpticalFlow cv::optflow::createOptFlow_SparseToDense()
    private static native long createOptFlow_SparseToDense_0();

    // C++:  Ptr_DualTVL1OpticalFlow cv::optflow::createOptFlow_DualTVL1()
    private static native long createOptFlow_DualTVL1_0();

    // C++:  Ptr_SparseOpticalFlow cv::optflow::createOptFlow_SparseRLOF()
    private static native long createOptFlow_SparseRLOF_0();

    // C++:  double cv::motempl::calcGlobalOrientation(Mat orientation, Mat mask, Mat mhi, double timestamp, double duration)
    private static native double calcGlobalOrientation_0(long orientation_nativeObj, long mask_nativeObj, long mhi_nativeObj, double timestamp, double duration);

    // C++:  void cv::motempl::calcMotionGradient(Mat mhi, Mat& mask, Mat& orientation, double delta1, double delta2, int apertureSize = 3)
    private static native void calcMotionGradient_0(long mhi_nativeObj, long mask_nativeObj, long orientation_nativeObj, double delta1, double delta2, int apertureSize);
    private static native void calcMotionGradient_1(long mhi_nativeObj, long mask_nativeObj, long orientation_nativeObj, double delta1, double delta2);

    // C++:  void cv::motempl::segmentMotion(Mat mhi, Mat& segmask, vector_Rect& boundingRects, double timestamp, double segThresh)
    private static native void segmentMotion_0(long mhi_nativeObj, long segmask_nativeObj, long boundingRects_mat_nativeObj, double timestamp, double segThresh);

    // C++:  void cv::motempl::updateMotionHistory(Mat silhouette, Mat& mhi, double timestamp, double duration)
    private static native void updateMotionHistory_0(long silhouette_nativeObj, long mhi_nativeObj, double timestamp, double duration);

    // C++:  void cv::optflow::calcOpticalFlowDenseRLOF(Mat I0, Mat I1, Mat& flow, Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 0, Size gridStep = Size(6, 6), InterpolationType interp_type = InterpolationType::INTERP_EPIC, int epicK = 128, float epicSigma = 0.05f, float epicLambda = 100.f, bool use_post_proc = true, float fgsLambda = 500.0f, float fgsSigma = 1.5f)
    private static native void calcOpticalFlowDenseRLOF_0(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda, float fgsSigma);
    private static native void calcOpticalFlowDenseRLOF_1(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda, boolean use_post_proc, float fgsLambda);
    private static native void calcOpticalFlowDenseRLOF_2(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda, boolean use_post_proc);
    private static native void calcOpticalFlowDenseRLOF_3(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma, float epicLambda);
    private static native void calcOpticalFlowDenseRLOF_4(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK, float epicSigma);
    private static native void calcOpticalFlowDenseRLOF_5(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height, int epicK);
    private static native void calcOpticalFlowDenseRLOF_6(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold, double gridStep_width, double gridStep_height);
    private static native void calcOpticalFlowDenseRLOF_8(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold);
    private static native void calcOpticalFlowDenseRLOF_9(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj, long rlofParam_nativeObj);
    private static native void calcOpticalFlowDenseRLOF_10(long I0_nativeObj, long I1_nativeObj, long flow_nativeObj);

    // C++:  void cv::optflow::calcOpticalFlowSF(Mat from, Mat to, Mat& flow, int layers, int averaging_block_size, int max_flow, double sigma_dist, double sigma_color, int postprocess_window, double sigma_dist_fix, double sigma_color_fix, double occ_thr, int upscale_averaging_radius, double upscale_sigma_dist, double upscale_sigma_color, double speed_up_thr)
    private static native void calcOpticalFlowSF_0(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int layers, int averaging_block_size, int max_flow, double sigma_dist, double sigma_color, int postprocess_window, double sigma_dist_fix, double sigma_color_fix, double occ_thr, int upscale_averaging_radius, double upscale_sigma_dist, double upscale_sigma_color, double speed_up_thr);

    // C++:  void cv::optflow::calcOpticalFlowSF(Mat from, Mat to, Mat& flow, int layers, int averaging_block_size, int max_flow)
    private static native void calcOpticalFlowSF_1(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int layers, int averaging_block_size, int max_flow);

    // C++:  void cv::optflow::calcOpticalFlowSparseRLOF(Mat prevImg, Mat nextImg, Mat prevPts, Mat& nextPts, Mat& status, Mat& err, Ptr_RLOFOpticalFlowParameter rlofParam = Ptr<RLOFOpticalFlowParameter>(), float forwardBackwardThreshold = 0)
    private static native void calcOpticalFlowSparseRLOF_0(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_nativeObj, long nextPts_nativeObj, long status_nativeObj, long err_nativeObj, long rlofParam_nativeObj, float forwardBackwardThreshold);
    private static native void calcOpticalFlowSparseRLOF_1(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_nativeObj, long nextPts_nativeObj, long status_nativeObj, long err_nativeObj, long rlofParam_nativeObj);
    private static native void calcOpticalFlowSparseRLOF_2(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_nativeObj, long nextPts_nativeObj, long status_nativeObj, long err_nativeObj);

    // C++:  void cv::optflow::calcOpticalFlowSparseToDense(Mat from, Mat to, Mat& flow, int grid_step = 8, int k = 128, float sigma = 0.05f, bool use_post_proc = true, float fgs_lambda = 500.0f, float fgs_sigma = 1.5f)
    private static native void calcOpticalFlowSparseToDense_0(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int grid_step, int k, float sigma, boolean use_post_proc, float fgs_lambda, float fgs_sigma);
    private static native void calcOpticalFlowSparseToDense_1(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int grid_step, int k, float sigma, boolean use_post_proc, float fgs_lambda);
    private static native void calcOpticalFlowSparseToDense_2(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int grid_step, int k, float sigma, boolean use_post_proc);
    private static native void calcOpticalFlowSparseToDense_3(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int grid_step, int k, float sigma);
    private static native void calcOpticalFlowSparseToDense_4(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int grid_step, int k);
    private static native void calcOpticalFlowSparseToDense_5(long from_nativeObj, long to_nativeObj, long flow_nativeObj, int grid_step);
    private static native void calcOpticalFlowSparseToDense_6(long from_nativeObj, long to_nativeObj, long flow_nativeObj);

}
