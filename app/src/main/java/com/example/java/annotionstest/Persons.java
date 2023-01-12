package com.example.java.annotionstest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2020-01-12 11:04
 * @Email:huangyonghuang@doumi.com
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Persons {

    //注解属性
    Person[] value();
}
