package com.example.mobile_pj.ent.Music

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.example.mobile_pj.R
import com.example.mobile_pj.ent.Ent_menu_music

class Design_music10 : AppCompatActivity() {
    var btn_next_music10 : Button? = null
    var btn_backto_m_music10 : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_music10)
        init()
        btn_next_music10!!.setOnClickListener {
            var intent = Intent(this, Design_music1::class.java)
            startActivity(intent)
        }
        btn_backto_m_music10!!.setOnClickListener {
            var intent = Intent(this, Ent_menu_music::class.java)
            startActivity(intent)
        }
        val videoView = findViewById<VideoView>(R.id.horse)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.horse
        val uri: Uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

    }
    fun init(){
        btn_next_music10 = findViewById(R.id.btn_next_music10)
        btn_backto_m_music10 =  findViewById(R.id.btn_backto_m_music10)
    }
}