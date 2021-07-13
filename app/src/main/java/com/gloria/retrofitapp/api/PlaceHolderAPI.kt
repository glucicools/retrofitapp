package com.gloria.retrofitapp.api

import com.gloria.retrofitapp.model.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {
    @GET("users")
    fun getUsers(): Call<List<User>>
}