package com.example.mobile_pj.mom

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R

class Menu_mom : AppCompatActivity() {
    var btn_storymom1: Button? = null
    var btn_storymom2: Button? = null
    var btn_storymom3: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_mom)
        init()
        btn_storymom1!!.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.slideshare.net/UtaiSukviwatsirikul/0-3-82160503")
            )
            startActivity(intent)
        }
        btn_storymom2!!.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.slideshare.net/UtaiSukviwatsirikul/3-6-80919677")
            )
            startActivity(intent)
        }
        btn_storymom3!!.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://pubhtml5.com/wrfu/dbuu/basic/"))
            startActivity(intent)
        }
    }

    fun init() {
        btn_storymom1 = findViewById(R.id.btn_storymom1)
        btn_storymom2 = findViewById(R.id.btn_storymom2)
        btn_storymom3 = findViewById(R.id.btn_storymom3)
    }
}