//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;



// C++: class GPCDetails
/**
 * Find correspondences between two images.
 * @param imgFrom First image in a sequence.
 * @param imgTo Second image in a sequence.
 * @param corr Output vector with pairs of corresponding points.
 * @param params Additional matching parameters for fine-tuning.
 */
public class GPCDetails {

    protected final long nativeObj;
    protected GPCDetails(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static GPCDetails __fromPtr__(long addr) { return new GPCDetails(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
