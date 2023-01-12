package com.example.android.DesignPattern;

/**
 * @Description: 内部类单例测试
 * @Author: huangyonghuang
 * @CreateDate: 2/24/21 10:27 AM
 */
public class SingleInstanceTest {

    private SingleInstanceTest() {

    }

    private static class singleInstanceHolder {

        private static SingleInstanceTest singleInstanceTest = new SingleInstanceTest();

    }


    public static SingleInstanceTest getInstance() {
        return singleInstanceHolder.singleInstanceTest;
    }


}