package com.example.lab8
import com.squareup.moshi.Json
import retrofit2.http.Query

data class datos(
    val name:String,
    val avatar_url: String,
    @Json(name="img_src") val imgSrcUrl: String,
    val Repositorio: String,
    val descripcion: String
)

