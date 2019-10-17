package com.sujan.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.sujan.bmicalculator.calculation.Calculation;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button btnCalculate;
    EditText etWeight, etHeight;
    TextView tvResult;

  double weight,height, bmi;
  String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate= findViewById(R.id.btnCalculate);

        etHeight=findViewById(R.id.etHeight);

        etWeight=findViewById(R.id.etWeight);

        tvResult=findViewById(R.id.tvResult);




        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(TextUtils.equals(etHeight.getText().toString(),"")){
            return;
        }
        if(TextUtils.equals(etWeight.getText().toString(),"")){
            return;
        }
        weight= Double.parseDouble(etWeight.getText().toString());
        height= Double.parseDouble(etHeight.getText().toString());



        Calculation cal = new Calculation(weight,height);

        bmi = cal.calculateBmi();
        cal.setBmi(bmi);
        result=cal.bmiResult();
        tvResult.setText(String.valueOf(bmi));


        int delay = 3000;// in ms

        Timer timer = new Timer();

        timer.schedule( new TimerTask(){
            @Override
            public void run() {
                Intent intent=new Intent();
                intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(result));

                startActivity(intent);
            }

        }, delay);




    }

}
