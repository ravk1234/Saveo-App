package com.ravi.saveoapp.remote

import com.ravi.saveoapp.modelClass.ResponseClass
import com.ravi.saveoapp.modelhorizontal.HorizonalClass
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiClient {

    @Headers("Accept: application/json")
    @GET("search/shows?q=god")
    suspend fun getShows(
        @Header("Content-Type") contentType: String
    ): List<ResponseClass>


    @Headers("Accept: application/json")
    @GET("shows?page=1")
    suspend fun getShows2(
        @Header("Content-Type") contentType: String
    ): List<HorizonalClass>
}