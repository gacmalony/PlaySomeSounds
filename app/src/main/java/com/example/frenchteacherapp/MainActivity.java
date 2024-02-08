package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button blcbtn, redbtn, grnbtn, bluebtn ;
        blcbtn = findViewById(R.id.button);
        grnbtn = findViewById(R.id.button2);
        redbtn = findViewById(R.id.button3);
        bluebtn = findViewById(R.id.button4);

        blcbtn.setOnClickListener(this);
        grnbtn.setOnClickListener(this);
        redbtn.setOnClickListener(this);
        bluebtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        final int clickedBtnId = view.getId();
        btn = findViewById(clickedBtnId);


        if(clickedBtnId == R.id.button){
            Playsounds(R.raw.black);
        } else if (clickedBtnId == R.id.button2) {
            Playsounds(R.raw.green);
        } else if (clickedBtnId == R.id.button3) {
            Playsounds(R.raw.red);
        }else {
            Playsounds(R.raw.purple);
        }
    }





    public void Playsounds(int id){
        MediaPlayer media = MediaPlayer.create(this, id);
        media.start();
    }
}