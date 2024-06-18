package com.example.application1.app

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.application1.R

class MainActivity : AppCompatActivity() {
    var TAG= "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "activity created")
    }

    override fun onStart(){
        super.onStart()
        Log.i(TAG,"activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"activity resumed")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"activity paused")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"activity stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"activity destroyed")

    }

    fun myClickHandler(view: View){
         Log.i("MainActivity", "button clicked")
        // var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:984532835"))
        /*var webIntent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
        startActivity(webIntent) */
        //createAlarm("vit", 19, 31)
        var hIntent:Intent=Intent(this,HomeActivity::class.java)
        startActivity(hIntent)
    }

    /*fun createAlarm(message:String, hour:Int, minutes:Int){
        val intent= Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE,message)
            putExtra(AlarmClock.EXTRA_HOUR,hour)
            putExtra(AlarmClock.EXTRA_MINUTES,minutes)
        }
        startActivity(intent)
    }*/
}