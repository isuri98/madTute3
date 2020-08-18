package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    EditText etnum1;
    EditText etnum2;
    TextView txtresult;

    String Number1;
    String Number2;

    int number1,number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);


        Intent intent = getIntent();
        Number1 = intent.getStringExtra("number1");
        Number2 = intent.getStringExtra("number2");

        etnum1.setText(Number1);
        etnum2.setText(Number2);

        number1 = Integer.parseInt(Number1);
        number2 = Integer.parseInt(Number2);
    }
        public void add (View view){
            txtresult.setText(Number1 + " + " + Number2 + " = " + (number1 + number2));
        }

        public void substract (View view){
            txtresult.setText(number1 + " - " + number2 + " = " + (number1 - number2));
        }

        public void multiply (View view){
            txtresult.setText(number1 + " * " + number2 + " = " + (number1 * number2));
        }

        public void devition (View view){
            txtresult.setText(number1 + " / " + number2 + " = " + (number1 / number2));
        }
    }

