package net.di.producer1

import android.app.Application
import android.content.Context
import android.util.Log
import net.di.producer1.controllers.FeatureDirectoryBuilder

class Producer1Application : Application() {


    init {
        Log.d("kajal", ":init ")
        instance = this
        FeatureDirectoryBuilder.build(this)
    }



    companion object {
        lateinit var instance: Application
        fun getInstance(): Context {
            Log.d("kaja", "getInstance: $instance")
            return instance
        }
    }
}