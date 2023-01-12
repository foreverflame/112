package com.example.kotlin.generic

/**
 * @description:先有泛型号声明
 * @author: huangyonghuang
 * @date: 2023/1/9
 */

fun main() {
    BlueColor(Blue())
}


fun <T> fromJson(json: String, tClass: Class<T>): T? {
    return tClass.newInstance()
}


abstract class Color<T>(var t: T) {
    abstract fun printColor(t: T)
}

class Blue {
    val color = "blue"
}

class BlueColor(blue: Blue) : Color<Blue>(blue) {
    override fun printColor(t: Blue) {
        print(t.color)
    }
}