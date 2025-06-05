package com.example.mobile_pj.ent.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R
import com.example.mobile_pj.ent.Menu_ent

class TicMainActivity : AppCompatActivity() {

    //lateinit var startNewGameButton: Button
    //lateinit var backMenuGameButton: Button
    var startNewGameButton : Button? = null
    var backMenuGameButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_main)
        init()
        startNewGameButton!!.setOnClickListener {
            var intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
        backMenuGameButton!!.setOnClickListener{
            var intent = Intent(this, Menu_ent::class.java)
            startActivity(intent)
        }

    }

    //override fun onCreate(savedInstanceState: Bundle?) {
     //   super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_tic_main)

      //  startNewGameButton.setOnClickListener {
      //      val intent = Intent(MainActivity@this, GameActivity::class.java)
       //     startActivity(intent)


       // backMenuGameButton.setOnClickListener{
        //    val intent = Intent(MainActivity@this,Menu_ent::class.java)
         //   startActivity(intent)
      //  }
       fun init(){
            startNewGameButton = findViewById(R.id.startNewGameButton)
            backMenuGameButton = findViewById(R.id.backMenuGameButton)
        }
    }
