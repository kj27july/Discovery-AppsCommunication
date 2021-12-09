package net.di.producer2

import android.app.Application
import android.content.Context
import net.di.producer2.controllers.FeatureDirectoryBuilder

class Producer2Application : Application() {

    init {
        instance = this
        FeatureDirectoryBuilder.build(this)
    }

    companion object {
        lateinit var instance: Application

        fun getInstance(): Context {
            return instance
        }
    }
}