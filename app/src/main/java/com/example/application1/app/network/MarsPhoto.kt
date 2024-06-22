package com.example.application1.app.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class MarsPhoto (
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String) {

}