package com.example.android.DesignPattern;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2019-12-29 19:58
 * @Email:huangyonghuang@doumi.com
 */
public class Boy implements Observer {

    String name;
    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"收到快递,"+message+"取快递");

    }
}
