package com.example;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;


/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2020/3/22 4:37 PM
 * @Email:huangyonghuang@doumi.com
 */
public class ExampleApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)){
            //用于打印内存泄漏的子进程
            return;
        }
        // 在这里写你app的初始化代码
        LeakCanary.install(this);
    }
}
