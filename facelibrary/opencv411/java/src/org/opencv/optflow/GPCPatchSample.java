//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;



// C++: class GPCPatchSample

public class GPCPatchSample {

    protected final long nativeObj;
    protected GPCPatchSample(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static GPCPatchSample __fromPtr__(long addr) { return new GPCPatchSample(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
