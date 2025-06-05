package com.example.mobile_pj.ent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.mobile_pj.Menu
import com.example.mobile_pj.R
import com.example.mobile_pj.ent.Flipcard.Flipcard1
import com.example.mobile_pj.ent.Snacke.SnackeMainActivity
import com.example.mobile_pj.ent.tictactoegame.TicMainActivity

class Menu_ent : AppCompatActivity() {
    var btn_menu_game : ImageButton? = null
    var btn_menu_music : ImageButton? = null
    var snacke: ImageButton? = null
    var flipcard: ImageButton? = null
    var button_stop: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_ent)
        init()
        btn_menu_game!!.setOnClickListener {
            var intent = Intent(this, TicMainActivity::class.java)
            startActivity(intent)
        }
        btn_menu_music!!.setOnClickListener {
            var intent = Intent(this, Ent_menu_music::class.java)
            startActivity(intent)
        }
        snacke!!.setOnClickListener {
            var intent = Intent(this, SnackeMainActivity::class.java)
            startActivity(intent)
        }
        flipcard!!.setOnClickListener {
            var intent = Intent(this, Flipcard1::class.java)
            startActivity(intent)
        }
        button_stop!!.setOnClickListener {
            var intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }

    fun init(){
        btn_menu_music = findViewById(R.id.btn_menu_music)
        btn_menu_game = findViewById(R.id.btn_menu_game)
        snacke =  findViewById(R.id.snacke)
        flipcard =  findViewById(R.id.flipcard)
        button_stop = findViewById(R.id.button_stop)

    }
}