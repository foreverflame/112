package com.example.android.DesignPattern;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2/24/21 10:44 AM
 */
public class SingleInstanceDoubleCheck {

    private volatile static SingleInstanceDoubleCheck instance = null;

    private SingleInstanceDoubleCheck() {

    }


    public static SingleInstanceDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingleInstanceDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingleInstanceDoubleCheck();
                }
            }
        }
        return instance;
    }
}