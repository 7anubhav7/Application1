package com.example.application1.app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.application1.R
import com.example.application1.app.network.MarsAdapter
import com.example.application1.app.network.MarsApi
import com.example.application1.app.network.MarsPhoto
import com.example.application1.databinding.ActivityHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    var marsPhotoKotlin = MarsPhoto("999","moonimage.com")

    //lateinit var brake:Int?
    // lateinit var recyclerview:RecyclerView
    lateinit var listMarsPhotos:List<MarsPhoto>
    lateinit var marsAdapter: MarsAdapter
    // lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding.marsphotoxml = marsPhotoKotlin

        /* var tvHome:TextView = findViewById(R.id.tvHome)
         tvHome.setText(marsPhoto.imgSrc)*/

        // imageView = findViewById(R.id.imageView)
        // recyclerview = findViewById(R.id.recyclerView)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        listMarsPhotos = ArrayList<MarsPhoto>()
        marsAdapter = MarsAdapter(listMarsPhotos)
        binding.recyclerView.adapter = marsAdapter
        // brake
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //  if(intent.extras != null) {
        var data = intent.extras?.getString("nkey")
        Log.i("HomeActivity","data is = "+data)
        // val homeTextView:TextView = findViewById(R.id.tvHome)
        binding.tvHome.setText(data)
        // homeTextView.setText(data)

    }

    override fun onStart() {
        super.onStart()
        if(::binding.isInitialized){
        binding.btnGET.setOnClickListener{
            getMarsPhotos()
        }
    }}



    /* fun getJson(view: View) {
         getMarsPhotos()
     }*/

    private fun getMarsPhotos() {
        GlobalScope.launch (Dispatchers.Main){
            //doing time taking tasks on the main thread is not advisable

            val listMarsPhoto = MarsApi.retrofitService.getPhotos()
            marsAdapter.listMarsPhotos = listMarsPhoto
            binding.imageView.load(listMarsPhoto.get(0).imgSrc)
            // imageView.load(listMarsPhoto.get(0).imgSrc)
            marsAdapter.notifyItemRangeChanged(0,listMarsPhoto.size)
            //  listMarsPhotos  = listMarsPhoto
            //marsAdapter.notifyDataSetChanged()
            Log.i("HomeActivity-1st imgsrc",listMarsPhoto.get(0).imgSrc)
        }

    }
}