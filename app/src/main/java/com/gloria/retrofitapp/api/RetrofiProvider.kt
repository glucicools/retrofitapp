package com.gloria.retrofitapp.api

import retrofit2.Retrofit

object RetrofiProvider {
    private val retrofit =
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            .build()
    val placeHolderAPI = retrofit.create(PlaceHolderAPI)

}