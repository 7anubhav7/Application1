package com.example.application1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun myClickHandler(view: View){
        Log.i("MainActivity", "button clicked")
        // var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:984532835"))
        var webIntent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
        startActivity(webIntent)
    }
}