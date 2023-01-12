package com.example.android.DesignPattern;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2019-12-29 20:01
 * @Email:huangyonghuang@doumi.com
 */
public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notify(String message);
}
