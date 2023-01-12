package com.example.kotlin.generic

/**
 * @description:
 * @author: huangyonghuang
 * @date: 2023/1/10
 */
class GenericTest {

}


//class GenericPersonJava<T>{
//    GenericPersonJava(t:T){
//        T t = new T()
//    }
//}

//泛型不能直接创建对象
//class GenericPersonKt<T>{
//    init {
//        val t:T = T()
//    }
//}


//泛型不能直接创建对象
class GenericPersonKt<T>(clazz: Class<T>) {
    init {
        val t: T = clazz.newInstance()
    }
}