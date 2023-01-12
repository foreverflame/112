package com.example.java;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 线程池测试，多种线程池
 * @Author: huangyonghuang
 * @CreateDate: 2020-02-13 11:11
 * @Email:huangyonghuang@doumi.com
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world！");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(" ===> main Thread execute here ! " );

    }

    





}
