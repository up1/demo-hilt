package com.example.hellohilt

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class DateFormatter @Inject constructor() {

    private val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")

    fun format(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}