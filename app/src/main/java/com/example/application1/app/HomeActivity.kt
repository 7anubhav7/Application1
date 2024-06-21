package com.example.application1.app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.application1.R
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var TAG: String =HomeActivity::class.java.simpleName

    var data= arrayOf("india","english","android","computer")
    var b=20

    lateinit var mySpinner: Spinner
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var a=10
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner =  findViewById(R.id.spinner)
        mySpinner.onItemSelectedListener = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var dataAdapter = DataAdapter(data)
        recyclerView.adapter = dataAdapter

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
        println(b)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    fun getShowText(view: View) {
        //get the text from et
        var uiEt:EditText = findViewById(R.id.etUi)
        var textTyped = uiEt.text.toString()
        //show the text in the tv
        var uiTv: TextView = findViewById(R.id.tvUi)
        uiTv.setText(textTyped)
    }
}