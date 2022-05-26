package com.tonyweather.android.logic.network

import com.tonyweather.android.TonyWeatherApplication
import com.tonyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  使用彩云天气提供的API获取数据
 *  网络请求实例：https://api.caiyunapp.com/v2/place?query=北京&token={token}&lang=zh_CN
 */
interface PlaceService {

    // query参数需要动态指定 所以使用Query注解的方式来实现 其中token为开发者申请的token
    @GET("v2/place?token=${TonyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}