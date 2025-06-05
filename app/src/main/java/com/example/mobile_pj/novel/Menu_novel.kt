package com.example.mobile_pj.novel


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.Menu
import com.example.mobile_pj.R

class Menu_novel : AppCompatActivity() {
    var btn_novel1: Button? = null
    var btn_novel2: Button? = null
    var btn_novel3: Button? = null
    var btn_novel4: Button? = null
    var btn_novel5: Button? = null
    var btn_novel6: Button? = null
    var btn_novel7: Button? = null
    var btn_novel8: Button? = null
    var btn_novel9: Button? = null
    var btn_novel10: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_novel)
        init()
        btn_novel1!!.setOnClickListener {
            var intent = Intent(this, Story_novel1::class.java)
            startActivity(intent)
        }
        btn_novel2!!.setOnClickListener {
            var intent = Intent(this, Story_novel2::class.java)
            startActivity(intent)
        }
        btn_novel3!!.setOnClickListener {
            var intent = Intent(this, Story_novel3::class.java)
            startActivity(intent)
        }
        btn_novel4!!.setOnClickListener {
            var intent = Intent(this, Story_novel4::class.java)
            startActivity(intent)
        }
        btn_novel5!!.setOnClickListener {
            var intent = Intent(this, Story_novel5::class.java)
            startActivity(intent)
        }
        btn_novel6!!.setOnClickListener {
            var intent = Intent(this, Story_novel6::class.java)
            startActivity(intent)
        }
        btn_novel7!!.setOnClickListener {
            var intent = Intent(this, Story_novel7::class.java)
            startActivity(intent)
        }
        btn_novel8!!.setOnClickListener {
            var intent = Intent(this, Story_novel8::class.java)
            startActivity(intent)
        }
        btn_novel9!!.setOnClickListener {
            var intent = Intent(this, Story_novel9::class.java)
            startActivity(intent)
        }
        btn_novel10!!.setOnClickListener {
            var intent = Intent(this, Story_novel10::class.java)
            startActivity(intent)
        }

    }

    fun init() {
       btn_novel1 = findViewById(R.id.btn_novl1)
       btn_novel2 = findViewById(R.id.btn_novel2)
       btn_novel3 = findViewById(R.id.btn_novel3)
        btn_novel4 = findViewById(R.id.btn_novel4)
        btn_novel5 = findViewById(R.id.btn_novel5)
        btn_novel6 = findViewById(R.id.btn_novel6)
        btn_novel7 = findViewById(R.id.btn_novel7)
        btn_novel8 = findViewById(R.id.btn_novel8)
        btn_novel9 = findViewById(R.id.btn_novel9)
        btn_novel10 = findViewById(R.id.btn_novel10)

    }
}