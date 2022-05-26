package com.tonyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 *  创建数据类 对应接口返回json格式的数据
 */

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)

