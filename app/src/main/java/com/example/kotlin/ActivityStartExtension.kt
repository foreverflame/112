package com.example.kotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * @description: reified 关键字使用/使抽象的东西更加具体或真实
 * @author: huangyonghuang
 * @date: 2023/1/9
 */


/**
 * 一般要传clazz
 */
fun <T : AppCompatActivity> AppCompatActivity.startActivity(context: Context, clazz: Class<T>) {
    startActivity(Intent(context, clazz))
}

/**
 * 通过给泛型添加reified
 * 其作用是防止泛形擦除，使得编译后的字节码仍然保留其真实类型
 */

 inline fun <reified T : AppCompatActivity> AppCompatActivity.startActivity(context: Context) {
    startActivity(Intent(context, T::class.java))
}

