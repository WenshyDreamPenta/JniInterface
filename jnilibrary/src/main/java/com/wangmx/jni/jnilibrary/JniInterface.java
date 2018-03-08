package com.wangmx.jni.jnilibrary;

/**
 * <pre>
 *     author : wangmingxing
 *     time   : 2018/3/8
 *     desc   :
 * </pre>
 */
public class JniInterface {
    public static native String stringFromJNI();

    static{
        System.loadLibrary("JniInterface");
    }
}
