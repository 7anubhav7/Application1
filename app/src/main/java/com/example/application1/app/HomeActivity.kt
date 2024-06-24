package com.example.application1.app

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.application1.R
import com.example.application1.app.database.Item
import com.example.application1.app.database.ItemDao
import com.example.application1.app.database.ItemRoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    lateinit var dao: ItemDao
    lateinit var tvHome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        tvHome = findViewById(R.id.tvHome)
        var database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()

    }

    fun insertDb(view: View) {
        GlobalScope.launch {
            val item = Item(777,"fruits",111.0,22)
            dao.insert(item)

        }
    }

    fun findItemDb(view: View) {
        GlobalScope.launch(Dispatchers.Main) {
            val item = dao.getItem(777).first()
            tvHome.setText(item.itemName)
        }
    }
}