package net.di.consumera.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.di.consumera.R
import net.di.consumera.connection.Provider
import android.content.IntentFilter
import android.util.Log

import net.di.consumera.receiver.ProducerReceiver


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //connecting to producer
        Provider().connectToProducer(this)

        // Receive broadcast from External App
        val intentFilter = IntentFilter("net.di.consumera")
        val producerReceiver = ProducerReceiver()
        Log.d("kajal", "consumer-onCreate: producerRecever")
        registerReceiver(producerReceiver, intentFilter)
    }
}