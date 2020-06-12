package com.example.hellohilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellohilt.databinding.ActivityMainBinding
import com.example.hellohilt.date.DateFormatterService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var dateFormatter: DateFormatter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.message.text = dateFormatter.format(timestamp = System.currentTimeMillis())

        setContentView(binding.root)
    }
}