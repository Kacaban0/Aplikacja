package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonColor, buttonText, buttonHide, buttonIncreaseSize;
    private float textSize = 15f;
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        buttonColor = findViewById(R.id.buttonColor);
        buttonText = findViewById(R.id.buttonText);
        buttonHide = findViewById(R.id.buttonHide);
        buttonIncreaseSize = findViewById(R.id.buttonIncreaseSize);

        Intent intent = getIntent();
        userName = intent.getStringExtra("name");

        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.GREEN);
            }
        });

        buttonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(userName);
            }
        });

        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
            }
        });

        buttonIncreaseSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize += 5f;
                textView.setTextSize(textSize);
            }
        });
    }
}
