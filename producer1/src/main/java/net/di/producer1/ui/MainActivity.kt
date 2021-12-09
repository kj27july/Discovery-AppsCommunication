package net.di.producer1.ui

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.di.producer1.Producer1Application
import net.di.producer1.R
import net.di.producer1.broadcast.AppBroadcast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  AppBroadcast().setIntent()
        val intent = Intent()
        intent.action = "net.di.consumera"
        intent.putExtra("producer", "producer1")
        //intent.component = ComponentName("net.di.consumera", "net.di.consumera.receiver.ProducerReceiver")
        sendBroadcast(intent)
    }
}