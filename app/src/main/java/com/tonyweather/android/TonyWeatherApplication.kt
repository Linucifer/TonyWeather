package com.tonyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *  ViewModel不再持有Activity的引用 因此需要创建一个类来“提供context“
 *  可全局获取context
 */
class TonyWeatherApplication : Application() {

    companion object {

        // 用于全局获取context
        @SuppressLint("StaticFieldLeak")    // 该注解使得AS忽略内存泄漏风险
        lateinit var context: Context

        // 彩云天气开发者平台令牌
        const val TOKEN = ""
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}