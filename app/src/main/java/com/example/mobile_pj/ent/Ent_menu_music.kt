
package com.example.mobile_pj.ent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R
import com.example.mobile_pj.ent.Music.*

class Ent_menu_music : AppCompatActivity() {
    var btn_music1: Button? = null
    var btn_music2: Button? = null
    var btn_music3: Button? = null
    var btn_music4: Button? = null
    var btn_music5: Button? = null
    var btn_music6: Button? = null
    var btn_music7: Button? = null
    var btn_music8: Button? = null
    var btn_music9: Button? = null
    var btn_music10: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ent_menu_music)
        init()
        btn_music1!!.setOnClickListener {
            var intent = Intent(this, Design_music1::class.java)
            startActivity(intent)
        }
        btn_music2!!.setOnClickListener{
            var intent = Intent(this, Design_music2::class.java)
            startActivity(intent)
        }
        btn_music3!!.setOnClickListener {
            var intent = Intent(this, Design_music3::class.java)
            startActivity(intent)
        }
        btn_music4!!.setOnClickListener{
            var intent = Intent(this, Design_music4::class.java)
            startActivity(intent)
        }
        btn_music5!!.setOnClickListener{
            var intent = Intent(this, Design_music5::class.java)
            startActivity(intent)
        }
        btn_music6!!.setOnClickListener {
            var intent = Intent(this, Design_music6::class.java)
            startActivity(intent)
        }
        btn_music7!!.setOnClickListener{
            var intent = Intent(this, Design_music7::class.java)
            startActivity(intent)
        }
        btn_music8!!.setOnClickListener {
            var intent = Intent(this, Design_music8::class.java)
            startActivity(intent)
        }
        btn_music9!!.setOnClickListener{
            var intent = Intent(this, Design_music9::class.java)
            startActivity(intent)
        }
        btn_music10!!.setOnClickListener{
            var intent = Intent(this, Design_music10::class.java)
            startActivity(intent)
        }
    }

    fun init(){
        btn_music1 = findViewById(R.id.btn_music1)
        btn_music2 = findViewById(R.id.btn_music2)
        btn_music3 = findViewById(R.id.btn_music3)
        btn_music4 = findViewById(R.id.btn_music4)
        btn_music5 = findViewById(R.id.btn_music5)
        btn_music6 = findViewById(R.id.btn_music6)
        btn_music7 = findViewById(R.id.btn_music7)
        btn_music8 = findViewById(R.id.btn_music8)
        btn_music9 = findViewById(R.id.btn_music9)
        btn_music10 = findViewById(R.id.btn_music10)
    }
}