package com.example.application1.app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application1.R
import com.example.application1.app.network.MarsApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    var data= intent.extras?.getString("mykey")
    Log.i("homeActivity", data.toString())
    var homeTextView:TextView = findViewById(R.id.textView)
    homeTextView.setText(data)

    }

    fun getJson(view:View){
        getMarsPhotos()
    }

    private fun getMarsPhotos() {
        GlobalScope.launch {
            val listResult = MarsApi.retrofitService.getPhotos()
            Log.i("HomeActivity", listResult)
        }
    }
}