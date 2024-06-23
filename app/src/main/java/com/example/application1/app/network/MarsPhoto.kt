package com.example.application1.app.network

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class MarsPhoto (
    val id: String,
    @Json(name = "img_src")
    val imgSrc: String) {

}