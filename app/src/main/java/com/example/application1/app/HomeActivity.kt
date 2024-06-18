package com.example.application1.app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.application1.R

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var TAG=HomeActivity::class.java.simpleName

    var data= arrayOf("india","english","android","computer")

    lateinit var mySpinner: Spinner
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner =  findViewById(R.id.spinner)
        mySpinner.onItemSelectedListener = this
        recyclerView = findViewById(R.id.recyclerView)

        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    var data= intent.extras?.getString("mykey")
    Log.i("homeActivity", data.toString())
    var homeTextView:TextView = findViewById(R.id.textView)
    homeTextView.setText(data)
    */
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item= parent?.selectedItem.toString()
        Log.i(TAG,item)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}