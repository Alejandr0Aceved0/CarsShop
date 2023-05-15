package com.ingacev.carsshop.login


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ingacev.carsshop.databinding.ActivityMainLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
