package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndiv,btnmul,btndec,btnsub,btnadd,btnback,btnclear,btnequals,dubzer;
    EditText TxtIp;
    String IP = "";
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtIp = findViewById(R.id.input);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btndiv = findViewById(R.id.btnDiv);
        btnmul = findViewById(R.id.btnMul);
        btndec = findViewById(R.id.btndec);
        btnsub = findViewById(R.id.btnsub);
        btnadd = findViewById(R.id.btnadd);
        btnback = findViewById(R.id.btnback);
        btnclear = findViewById(R.id.btnclear);
        btnequals = findViewById(R.id.btnequals);
        dubzer = findViewById(R.id.btndobzer);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndec.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnback.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnequals.setOnClickListener(this);
        dubzer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
          switch (view.getId()) {
              case R.id.btn0:
                  TxtIp.setText(TxtIp.getText() + "0");
                  break;
              case R.id.btn1:
                  TxtIp.setText(TxtIp.getText() + "1");
                  break;
              case R.id.btn2:
                  TxtIp.setText(TxtIp.getText() + "2");
                  break;
              case R.id.btn3:
                  TxtIp.setText(TxtIp.getText() + "3");
                  break;
              case R.id.btn4:
                  TxtIp.setText(TxtIp.getText() + "4");
                  break;
              case R.id.btn5:
                  TxtIp.setText(TxtIp.getText() + "5");
                  break;
              case R.id.btn6:
                  TxtIp.setText(TxtIp.getText() + "6");
                  break;
              case R.id.btn7:
                  TxtIp.setText(TxtIp.getText() + "7");
                  break;
              case R.id.btn8:
                  TxtIp.setText(TxtIp.getText() + "8");
                  break;
              case R.id.btn9:
                  TxtIp.setText(TxtIp.getText() + "9");
                  break;
              case R.id.btnequals:
                  Expression expression = new ExpressionBuilder(TxtIp.getText().toString()).build();
                  double output = expression.evaluate();
                  TxtIp.setText(output + "");
                  break;
              case R.id.btndec:
                  if(counter == 1) {
                      Toast.makeText(this, "More than one decimal not allowed", Toast.LENGTH_SHORT).show();
                  } else {
                      TxtIp.setText(TxtIp.getText() + ".");
                      counter++;
                  }
                  break;
              case R.id.btnadd:
                  counter = 0;
                  TxtIp.setText(TxtIp.getText() + "+");
                  break;
              case R.id.btnsub:
                  counter = 0;
                  TxtIp.setText(TxtIp.getText() + "-");
                  break;
              case R.id.btnMul:
                  counter = 0;
                  TxtIp.setText(TxtIp.getText() + "*");
                  break;
              case R.id.btnDiv:
                  counter = 0;
                  TxtIp.setText(TxtIp.getText() + "/");
                  break;
              case R.id.btndobzer:
                  TxtIp.setText(TxtIp.getText() + "00");
                  break;
              case R.id.btnclear:
                  counter = 0;
                  TxtIp.setText("");
                  break;
              case R.id.btnback:
                  if (!TextUtils.isEmpty(TxtIp.getText())) {
                      counter = 0;
                      TxtIp.setText(TxtIp.getText().toString().substring(0,TxtIp.getText().toString().length() - 1));
                  }
                  break;

          }
    }
}