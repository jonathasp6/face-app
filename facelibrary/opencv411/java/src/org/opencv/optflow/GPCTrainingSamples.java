//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;



// C++: class GPCTrainingSamples
/**
 * Class encapsulating training samples.
 */
public class GPCTrainingSamples {

    protected final long nativeObj;
    protected GPCTrainingSamples(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static GPCTrainingSamples __fromPtr__(long addr) { return new GPCTrainingSamples(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
