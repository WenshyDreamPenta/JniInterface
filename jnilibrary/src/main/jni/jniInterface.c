//
// Created by Wangmingxing on 2018/3/8.
//
#include <jni.h>
#include <string.h>
JNIEXPORT jstring JNICALL Java_com_wangmx_jni_jnilibrary_JniInterface_stringFromJNI(JNIEnv *env,
jobject obj)
{

    return (*env)->NewStringUTF(env, "Hello from JNI !");

}
