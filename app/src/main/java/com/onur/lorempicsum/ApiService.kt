package com.onur.lorempicsum

import com.google.gson.JsonElement
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/v2/list")
    suspend fun fetchPhotos(): Response<Array<Photo>>
}