package com.gloria.retrofitapp.UI

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gloria.retrofitapp.api.RetrofiProvider
import com.gloria.retrofitapp.model.User
import retrofit2.Call
import retrofit2.Response

class MainViewModel: ViewModel() {
    val postLiveData = MutableLiveData<List<User>>()

            fun getUsers(){
                RetrofiProvider.placeHolderAPI.getUsers().enquene(object : Callback<List<User>>){
                    override fun onResponse(call: Call<List<User>>, response: Response<List<User>>){
                        response.body()?.let {
                            usersLiveData.postValue(it)
                        }
                    }
                    override fun onFailure(call: Call<List<User>>, t: Throwable){

                    }
                }
            }
}