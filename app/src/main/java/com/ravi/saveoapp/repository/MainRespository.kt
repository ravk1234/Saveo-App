package com.ravi.saveoapp.repository

import com.ravi.saveoapp.modelClass.ResponseClass
import com.ravi.saveoapp.modelhorizontal.HorizonalClass
import com.ravi.saveoapp.remote.ApiClient
import com.ravi.saveoapp.remote.Network
import com.ravi.saveoapp.remote.Resource
import com.ravi.saveoapp.remote.ResponseHandler


/**
 * This is a `M` layer in the `MVVM` architecture which gives us the data from the API
 */
class MainRespository {
    private val CONTENT_TYPE = "application/json"
    val apiClient = Network.getInstance().create(ApiClient::class.java)
    val responseHandler = ResponseHandler()

    suspend fun getListOfMovies(): Resource<List<ResponseClass>> {
        val call = apiClient.getShows(CONTENT_TYPE)
        /*
       Once the response is fetched, navigate the user back to view model as this callback is being implemented
       in the ViewModel class
        */
        return responseHandler.handleSuccess(call)
    }

    suspend fun getListOfMovies2(): Resource<List<HorizonalClass>> {
        val call = apiClient.getShows2(CONTENT_TYPE)
        /*
       Once the response is fetched, navigate the user back to view model as this callback is being implemented
       in the ViewModel class
        */
        return responseHandler.handleSuccess(call)
    }
}