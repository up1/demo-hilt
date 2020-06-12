package com.example.hellohilt.date

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

interface DateFormatterService {
    fun format(timestamp: Long): String
}

class RealDateFormatterService @Inject constructor() : DateFormatterService {
    private val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
    override fun format(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}