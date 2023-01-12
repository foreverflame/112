package com.example.kotlin.generic

/**
 * @description:泛型接口
 * @author: huangyonghuang
 * @date: 2023/1/9
 */
interface Drinks<T> {

    fun taste(tag: T)

    fun price(): T
}