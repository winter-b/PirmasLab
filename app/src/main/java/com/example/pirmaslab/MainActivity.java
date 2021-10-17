package com.example.pirmaslab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private Button mButton2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView1);
        mButton = findViewById(R.id.button_send);
        mButton.setOnClickListener(this);
        mButton2 = findViewById(R.id.button_send2);
        mButton2.setVisibility(View.INVISIBLE);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.button_send:
                tv.setText("Hello friend");
                mButton2.setVisibility(View.VISIBLE);
            case R.id.button_send2:

        }
    }
}