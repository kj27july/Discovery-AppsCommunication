package net.di.consumera.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ProducerReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val producer1 = intent?.getStringExtra("producer")
        Log.d("kajal", "onReceive:$producer1")
    }
}