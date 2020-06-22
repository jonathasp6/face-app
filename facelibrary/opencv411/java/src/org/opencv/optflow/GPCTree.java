//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.optflow;

import org.opencv.core.Algorithm;

// C++: class GPCTree
/**
 * Class for individual tree.
 */
public class GPCTree extends Algorithm {

    protected GPCTree(long addr) { super(addr); }

    // internal usage only
    public static GPCTree __fromPtr__(long addr) { return new GPCTree(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
