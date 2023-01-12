//
// Created by 黄永煌 on 2020-01-02.
//

#include<jni.h>

#include <string>

#include <people.h>


extern "C" JNIEXPORT

jstring JNICALL
Java_com_example_activity_Main2Activity_stringFromJNI(JNIEnv *env,
                                                              jclass thiz) {
    std::string hello = "Hello,I from C++";
    people pe;
    return env->NewStringUTF(pe.getString().c_str());
}



extern "C" JNIEXPORT
jstring JNICALL
Java_com_example_activity_Main2Activity_getSring(JNIEnv *env, jclass clazz) {

    std::string hello = "Hello,I from C++";
    people pe;
    return env->NewStringUTF(pe.getString().c_str());
}


//jni层调用java方法
extern "C" JNIEXPORT
void JNICALL
Java_com_example_activity_Main2Activity_callJavaStaticMethodFromJni(JNIEnv *env,
                                                                            jclass type) {

    jclass jniHandle = env->FindClass((char *) "com/example/android/jni/JniHandle");
    if (NULL == jniHandle) {
        return;
    }
    jmethodID getStringFromStatic = env->GetStaticMethodID(jniHandle, "getStringFromStatic",
                                                           "()Ljava/lang/String;");
    if (NULL == getStringFromStatic) {
        env->DeleteLocalRef(jniHandle);
        return;
    }
//    jstring result = env->CallStaticObjectMethod(jniHandle, getStringFromStatic);
//    const char *resultChar = env->GetStringUTFChars(result, NULL);
//    env->DeleteLocalRef(jniHandle);
//    env->DeleteLocalRef(result);

}
