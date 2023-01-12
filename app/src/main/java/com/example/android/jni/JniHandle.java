package com.example.android.jni;

/**
 * @Description: 用于测试jni层调用java层，静态方法和非静态方法
 * @Author: huangyonghuang
 * @CreateDate: 2020/3/22 9:56 AM
 * @Email:huangyonghuang@doumi.com
 */
public class JniHandle {

    public static String getStringFromStatic() {
        return "string from static method in java";
    }

    public String getStringFrom() {
        return "string from  method in java";
    }


}
