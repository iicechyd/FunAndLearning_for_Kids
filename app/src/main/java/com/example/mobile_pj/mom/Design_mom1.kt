package com.example.mobile_pj.mom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R

class Design_mom1 : AppCompatActivity() {
    var btn_backto_m_mom : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_mom1)
        init()
        btn_backto_m_mom!!.setOnClickListener {
            var intent = Intent(this, Menu_mom::class.java)
            startActivity(intent)
        }
    }

    fun init(){
        btn_backto_m_mom = findViewById(R.id.btn_backto_m_mom)
    }
}