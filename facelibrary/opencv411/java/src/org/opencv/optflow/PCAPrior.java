//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;



// C++: class PCAPrior
/**
 * @brief
 * This class can be used for imposing a learned prior on the resulting optical flow.
 * Solution will be regularized according to this prior.
 * You need to generate appropriate prior file with "learn_prior.py" script beforehand.
 */
public class PCAPrior {

    protected final long nativeObj;
    protected PCAPrior(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static PCAPrior __fromPtr__(long addr) { return new PCAPrior(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
