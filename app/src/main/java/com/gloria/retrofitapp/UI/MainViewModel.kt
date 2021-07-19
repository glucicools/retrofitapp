package com.gloria.retrofitapp.UI

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gloria.retrofitapp.api.RetrofiProvider
import com.gloria.retrofitapp.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainViewModel: ViewModel() {
    val postLiveData = MutableLiveData<List<User>>()

            fun getUsers(){
                coroutineScope (Dispatchers.IO).launch{
                    usersLivesData.postValue(RetrofitProvider.placeHolderAPI.getUsers())
                }

                    }
                }

