package com.example.mobile_pj.novel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R

class Story_novel10 : AppCompatActivity() {
    var bacx_novel10 : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_novel10)
        init()
        bacx_novel10!!.setOnClickListener {
            var intent = Intent(this, Menu_novel::class.java)
            startActivity(intent)
        }
    }
    fun init(){
        bacx_novel10 = findViewById(R.id.bacx_novel10)
    }
}