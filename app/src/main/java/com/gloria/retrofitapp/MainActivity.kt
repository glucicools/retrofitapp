package com.gloria.retrofitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.gloria.retrofitapp.UI.MainViewModel
import com.gloria.retrofitapp.UI.UserAdapter
import com.gloria.retrofitapp.databinding.ActivityMainBinding
import com.gloria.retrofitapp.databinding.UserItemBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var ViewModel: MainViewModel
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(listOf())
        viewModel = viewModelProvider(this)(MainViewModel::class.java)

        binding.userRecyclerView.apply{
            adapter =UserAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        viewModel.run{
            getUsers()
            userLivedata.observe(this@MainActivity, )
        }
    }


    }
