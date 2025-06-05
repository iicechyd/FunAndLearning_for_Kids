package com.example.mobile_pj.ent.Snacke;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mobile_pj.Menu;
import com.example.mobile_pj.R;
import com.example.mobile_pj.ent.Menu_ent;
import com.example.mobile_pj.study.ColorsActivity;
import com.example.mobile_pj.study.KidsMainActivity;

public class SnackeMainActivity extends AppCompatActivity {
    public static ImageView img_swipe;
    public static Dialog dialogScore;
    private GameView gv;

   // public static Button btn_backe_ent;
    public static TextView txt_score, txt_best_score, txt_dialog_score, txt_dialog_best_score;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        Constants.SCREEN_WIDTH = dm.widthPixels;
        Constants.SCREEN_HEIGHT = dm.heightPixels;
        setContentView(R.layout.activity_snacke_main);

        //btn_backe_ent = (Button) findViewById(R.id.btn_backe_ent);
        img_swipe = (ImageView) findViewById(R.id.img_swipe);
        gv = (GameView) findViewById(R.id.gv);
        txt_score = (TextView) findViewById(R.id.txt_score);
        txt_best_score = (TextView) findViewById(R.id.txt_best_score);

        dialogScore();
        //btn_backe_ent.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {
          //      startActivity(new Intent(SnackeMainActivity.this, Menu_ent.class));
           // }
        //});
    }

    private void dialogScore() {
        int bestScore = 0;
        SharedPreferences sp = this.getSharedPreferences("gamesetting", Context.MODE_PRIVATE);
        if(sp!=null){
            bestScore = sp.getInt("bestscore",0);
        }
        SnackeMainActivity.txt_best_score.setText(bestScore+"");
        dialogScore = new Dialog(this);
        dialogScore.setContentView(R.layout.dialog_start);
        txt_dialog_score = dialogScore.findViewById(R.id.txt_dialog_score);
        txt_dialog_best_score = dialogScore.findViewById(R.id.txt_dialog_best_score);
        txt_dialog_best_score.setText(bestScore + "");
        dialogScore.setCanceledOnTouchOutside(false);
        RelativeLayout rl_start = dialogScore.findViewById(R.id.rl_start);
        rl_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_swipe.setVisibility(View.VISIBLE);
                gv.reset();
                dialogScore.dismiss();
            }
        });
        dialogScore.show();
    }
}
