package com.vm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Bp2 extends AppCompatActivity {
ImageView ima1;
ImageView ima2;
ImageView ima3;
ImageView ima4;
ImageView ima5;
ImageView ima6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp2);
        ima1 = findViewById(R.id.img1);
        ima2 = findViewById(R.id.img2);
        ima3 = findViewById(R.id.img3);
        ima4 = findViewById(R.id.img4);
        ima5 = findViewById(R.id.img5);
        ima6 = findViewById(R.id.img6);
        ima1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bp2.this, "animal", Toast.LENGTH_SHORT).show();
            }
        });
        ima2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bp2.this, "animal", Toast.LENGTH_SHORT).show();
            }
        });
        ima3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bp2.this, "animal", Toast.LENGTH_SHORT).show();
            }
        });
        ima4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bp2.this, "animal", Toast.LENGTH_SHORT).show();
            }
        });
        ima5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bp2.this, "animal", Toast.LENGTH_SHORT).show();
            }
        });
        ima6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bp2.this, "animal", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
