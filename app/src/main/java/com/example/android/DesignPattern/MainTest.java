package com.example.android.DesignPattern;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2019-12-29 19:45
 * @Email:huangyonghuang@doumi.com
 */
public class MainTest {

    public static void main(String[] args) {

        PostMan postMan = new PostMan();
        Girl girl = new Girl("1");
        Girl girl2 = new Girl("2");
        Boy boy = new Boy("1");

        postMan.add(girl);
        postMan.add(girl2);
        postMan.add(boy);

        postMan.notify("去取快递");

    }
}
