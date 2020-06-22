//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;



// C++: class GPCPatchDescriptor
/**
 * sparse_matching_gpc.hpp
 * @author Vladislav Samsonov &lt;vvladxx@gmail.com&gt;
 * Implementation of the Global Patch Collider.
 *
 * Implementation of the Global Patch Collider algorithm from the following paper:
 * http://research.microsoft.com/en-us/um/people/pkohli/papers/wfrik_cvpr2016.pdf
 *
 * CITE: Wang_2016_CVPR
 */
public class GPCPatchDescriptor {

    protected final long nativeObj;
    protected GPCPatchDescriptor(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static GPCPatchDescriptor __fromPtr__(long addr) { return new GPCPatchDescriptor(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
