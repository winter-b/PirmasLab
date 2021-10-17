package com.example.pirmaslab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private Button mButton2;
    private TextView tv;
    private ConstraintLayout rl;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = findViewById(R.id.rl1);
        tv = (TextView) findViewById(R.id.textView1);
        iv = (ImageView) findViewById(R.id.imageView2);
        iv.setVisibility(View.INVISIBLE);

        mButton = findViewById(R.id.button_send);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Hello friend");
                mButton2.setVisibility(View.VISIBLE);
            }
        });
        mButton2 = findViewById(R.id.button_send2);
        mButton2.setVisibility(View.INVISIBLE);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setVisibility(View.VISIBLE);
                rl.setBackgroundResource(R.color.black);
                tv.setTextColor(Color.parseColor("#ff0000"));
                finishAndRemoveTask();
            }
        });
    }

}