package com.example.android.DesignPattern;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2019-12-29 20:02
 * @Email:huangyonghuang@doumi.com
 */
public class PostMan implements Observable {

    ArrayList<Observer> arrayList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        arrayList.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        arrayList.remove(observer);

    }

    @Override
    public void notify(String message) {
        for (Observer observer : arrayList) {
            observer.update(message);


        }

    }
}
