package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Username, Password;
    Button btnadd,btnreset;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);
        btnadd = findViewById(R.id.btnadd);
        btnreset = findViewById(R.id.reset);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  if (TextUtils.isEmpty(Username.getText()) && TextUtils.isEmpty(Password.getText())) {
                      Toast.makeText(MainActivity.this, "Enter your Credentials", Toast.LENGTH_SHORT).show();
                  } else if (Username.getText().toString().equals("Madhav") && Password.getText().toString().equals("mad123")){
                      Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                  } else {
                      counter++;
                      Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                      if (counter == 2) {
                          Username.setEnabled(false);
                          Password.setEnabled(false);
                          btnadd.setEnabled(false);
                      }
                  }
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Username.setText("");
                Password.setText("");
            }
        });
    }
}