package com.example.kotlin.coroutine

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @description: 协程test
 * @author: huangyonghuang
 * @date: 2023/1/11
 */
class CoroutineTest {

    fun main() {
        start()
    }


    fun test() {
        GlobalScope.launch {

        }

        /**
         * 阻塞调用的线程
         */
        runBlocking {

        }
    }


    private fun start() {
        val runBlock = runBlocking {
            Log.d("runBlocking", "启动一个协程")
            41
        }
        Log.d("runBlockingJob", "$runBlock")
        val launchJob = GlobalScope.launch {
            Log.d("launch", "启动一个协程")
        }
        Log.d("launchJob", "$launchJob")
        val asyncJob = GlobalScope.async {
            Log.d("async", "启动一个协程")
            "我是返回值"
        }
        Log.d("asyncJob", "$asyncJob")
    }
}

fun testAge() {
    val person = Person(10, "")
    val i = 4
    i.plus(person.age)
}

class Person(var age: Int = 3, var name: String) {
    operator fun plus(other: Person): Person {
        return Person(age + other.age, name + "+" + other.name)
    }
}

operator fun Int.plus(person: Person): Int {
    return this - person.age
}