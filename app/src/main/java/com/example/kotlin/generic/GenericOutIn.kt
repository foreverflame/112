package com.example.kotlin.generic

/**
 * @description: kotlin 泛型逆变协变
 * @author: huangyonghuang
 * @date: 2023/1/10
 */
class GenericOutIn {

    fun test() {

        /**
         * 逆变，java ？super Number  in  写入
         * 协变，java ？extend Number out 返回，读取
         */
        var inList: MutableList<in Number> = ArrayList()


        var outList: MutableList<out Number> = ArrayList<Int>()



    }


}