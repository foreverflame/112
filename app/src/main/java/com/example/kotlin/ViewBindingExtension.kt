package com.example.kotlin

import android.app.Dialog
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @description: 内敛函数/reified
 * @author: huangyonghuang
 * @date: 2023/1/6
 */

/**
 * AppCompatActivity#onCreate()使用
 */
inline fun <reified VB : ViewBinding> AppCompatActivity.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).apply {
        setContentView(root)
    }
}


/**
 * Dialog#onCreate() 使用
 */
inline fun <reified VB : ViewBinding> Dialog.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).apply {
        setContentView(root)
    }
}

/**
 * 继承自ViewGroup的使用
 */
inline fun <reified VB : ViewBinding> ViewGroup.inflate(
    parent: ViewGroup,
    attachRoot: Boolean = true
): VB {
    return inflateBinding(LayoutInflater.from(parent.context), parent, false)
}

/**
 * Recycler.Adapter#onCreateViewHolder() 使用
 */
inline fun <reified VB : ViewBinding> inflate(parent: ViewGroup): VB {
    return inflateBinding(LayoutInflater.from(parent.context), parent, false)
}


@Suppress("UNCHECKED_CAST")
inline fun <reified VB : ViewBinding> inflateBinding(
    layoutInflater: LayoutInflater,
    viewGroup: ViewGroup? = null,
    attachToRoot: Boolean = false
) = VB::class.java.getMethod(
    "inflate",
    LayoutInflater::class.java,
    ViewGroup::class.java,
    Boolean::class.java
).invoke(null, layoutInflater, viewGroup, attachToRoot) as VB
