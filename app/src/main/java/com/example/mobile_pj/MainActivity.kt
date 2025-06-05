package com.example.mobile_pj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    var btn_start : ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        btn_start!!.setOnClickListener {
            var intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }

    fun init(){
        btn_start = findViewById(R.id.btn_start)
    }
}
