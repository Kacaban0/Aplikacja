package com.example.myapplication;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.SecondActivity;

public class MainActivity extends AppCompatActivity {

 EditText nameInput;
 Button loginButton;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  nameInput = findViewById(R.id.nameInput);
  loginButton = findViewById(R.id.loginButton);

  loginButton.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View v) {
    String enteredName = nameInput.getText().toString();

    if (!enteredName.isEmpty()) {
     Intent intent = new Intent(MainActivity.this, SecondActivity.class);
     intent.putExtra("name", enteredName);
     startActivity(intent);
    } else {
     Toast.makeText(MainActivity.this, "Proszę wprowadzić imię", Toast.LENGTH_SHORT).show();
    }
   }
  });
 }
}