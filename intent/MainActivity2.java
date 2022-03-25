package com.mohsin.transferdataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();
        txt = intent.getStringExtra("txtData");
        Toast.makeText(this, "Entered Data " + txt.toString(), Toast.LENGTH_SHORT).show();
    }
}