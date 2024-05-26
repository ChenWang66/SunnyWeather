package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
        const val TOKEN = "J77EAU2o0r5LWIvn"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}