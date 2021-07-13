package com.gloria.retrofitapp.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gloria.retrofitapp.databinding.ActivityMainBinding
import com.gloria.retrofitapp.databinding.UserItemBinding
import com.gloria.retrofitapp.model.User

class UserAdapter(var user: List<User>) {
    class UserViewHolder(private val binding: UserItemBinding):
            RecyclerView.ViewHolder(binding.root){
                fun bind(user: User) {
                    binding.apply {
                        nameView.text = user.name
                        emailView.text =user.email
                        streetView.text = user.address.street


                    }
                }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): UserViewHolder{
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context))
        return  UserViewHolder(binding)
    }
override fun onBindViewHolder(holder: UserViewHolder, position: Int){
    val user = user[position]
    holder.bind(user)
}
    override fun getItemCount(): Int{
        return user.size
    }
}