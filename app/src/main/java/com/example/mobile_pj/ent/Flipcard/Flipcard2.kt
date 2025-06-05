package com.example.mobile_pj.ent.Flipcard

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.Button
import android.widget.ImageView
import com.example.mobile_pj.Menu
import com.example.mobile_pj.R
import com.example.mobile_pj.ent.Menu_ent

class Flipcard2 : AppCompatActivity() {
    var next : Button? = null
    var back : Button? = null
    private lateinit var cardImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flipcard2)
        init()
        next!!.setOnClickListener {
            var intent = Intent(this, Flipcard3::class.java)
            startActivity(intent)
        }
        back!!.setOnClickListener {
            var intent = Intent(this, Menu_ent::class.java)
            startActivity(intent)
        }
    }
    fun init() {
        next = findViewById(R.id.next)
        back = findViewById(R.id.back)



        cardImg = findViewById(R.id.cardImg)
        cardImg.setOnClickListener{flipAnimation()}
    }
    private fun flipAnimation(){
        val oa1 = ObjectAnimator.ofFloat(cardImg,"scaleX",1f,0f)
        val oa2 = ObjectAnimator.ofFloat(cardImg,"scaleX",0f,1f)

        oa1.interpolator = DecelerateInterpolator()
        oa2.interpolator = AccelerateDecelerateInterpolator()

        oa1.addListener(object : AnimatorListenerAdapter(){
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                if (cardImg.drawable.constantState == resources.
                    getDrawable(R.drawable.flip_b2).constantState){
                    cardImg.setImageResource(R.drawable.flip_f2)
                }else{
                    cardImg.setImageResource(R.drawable.flip_b2)
                }
                oa2.start()
            }
        })
        oa1.start()
        oa1.setDuration(1000)
    }
}