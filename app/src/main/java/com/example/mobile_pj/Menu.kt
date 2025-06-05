package com.example.mobile_pj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.mobile_pj.ent.Menu_ent
import com.example.mobile_pj.mom.Menu_mom
import com.example.mobile_pj.novel.Menu_novel
import com.example.mobile_pj.study.KidsMainActivity

class Menu : AppCompatActivity() {
    var btn_novel : Button? = null
    var btn_ent : Button? = null
    var btn_study : Button? = null
    var btn_mom : Button? = null
    var button_home : ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        init()
        btn_novel!!.setOnClickListener {
            var intent = Intent(this, Menu_novel::class.java)
            startActivity(intent)
        }
        btn_ent!!.setOnClickListener {
            var intent = Intent(this, Menu_ent::class.java)
            startActivity(intent)
        }
        btn_study!!.setOnClickListener {
            var intent = Intent(this, KidsMainActivity::class.java)
            startActivity(intent)
        }
        btn_mom!!.setOnClickListener {
            var intent = Intent(this, Menu_mom::class.java)
            startActivity(intent)
        }
        button_home!!.setOnClickListener {
           var intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
        }
    }

    fun init(){
        btn_novel = findViewById(R.id.btn_novel)
        btn_ent = findViewById(R.id.btn_ent)
        btn_study = findViewById(R.id.btn_study)
        btn_mom = findViewById(R.id.btn_mom)
        button_home = findViewById(R.id.button_home)
    }
}
