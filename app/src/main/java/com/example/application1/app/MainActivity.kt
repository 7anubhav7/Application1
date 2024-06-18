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
        Log.i(TAG, "activity created -- memory allocation")
    }

    override fun onStart(){
        super.onStart()
        Log.i(TAG,"activity started -- initialize data")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"activity resumed -- restore state of the app")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"activity paused -- store the app state")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"activity stopped -- ")

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
        add(10,23)
        var hIntent:Intent=Intent(this,HomeActivity::class.java)
        startActivity(hIntent)
    }

    private fun add(i:Int,i1:Int): Int {
        var c=5*28
        var d=c+i
        mul(5,4)
        return i+i1
    }

    private fun mul(i:Int,i1:Int){
        div(9,3)
    }

    private fun div(i:Int,i1:Int){
        subtract(10,5)
    }

    private fun subtract(i:Int,i1:Int){
        i1-i
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