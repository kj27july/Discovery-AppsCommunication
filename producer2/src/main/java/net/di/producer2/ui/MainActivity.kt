package net.di.producer2.ui

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.di.producer2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent()
        intent.action = "net.di.consumera"
        intent.putExtra("producer", "producer2")
        intent.component = ComponentName("net.di.consumera", "net.di.consumera.receiver.ProducerReceiver")
        sendBroadcast(intent)
    }
}