package com.example.mobile_pj.novel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R

class Story_novel1 : AppCompatActivity() {
    var bacx_novel : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_novel1)
        init()
        bacx_novel!!.setOnClickListener {
           var intent = Intent(this, Menu_novel::class.java)
           startActivity(intent)
       }
   }
    fun init(){
        bacx_novel = findViewById(R.id.bacx_novel)
    }
}