package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2.databinding.ActivityAddUserBinding

import com.example.lab2.recyclerview.User

class AddUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val phone  = binding.phone.text.toString()

            val user = User(name, phone)

            MainActivity.Users.add(user)


            finish()
        }
    }
}
