package com.sujan.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    TextView tvFeedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvFeedback=findViewById(R.id.tvFeedback);

        Intent intent = getIntent();
        String feedback = intent.getStringExtra(Intent.EXTRA_TEXT);
        tvFeedback.setText("Your Body is "+feedback);

    }

}
