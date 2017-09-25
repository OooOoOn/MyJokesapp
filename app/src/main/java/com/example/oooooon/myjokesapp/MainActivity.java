package com.example.oooooon.myjokesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b_toast1, b_toast2, b_toast3, b_message1, b_message2, b_message3;
    TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_toast1 = (Button) findViewById(R.id.b_toast1);
        b_toast2 = (Button) findViewById(R.id.b_toast2);
        b_toast3 = (Button) findViewById(R.id.b_toast3);
        b_message1 = (Button) findViewById(R.id.b_message1);
        b_message2 = (Button) findViewById(R.id.b_message2);
        b_message3 = (Button) findViewById(R.id.b_message3);
        tv_message = (TextView) findViewById(R.id.tv_message);

        b_toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.answerOne, Toast.LENGTH_SHORT).show();
            }
        });

        b_toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.answerTwo, Toast.LENGTH_SHORT).show();
            }
        });

        b_toast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.answerThree, Toast.LENGTH_SHORT).show();
            }
        });

        b_message1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText(R.string.answerFour);
            }
        });

        b_message2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText(R.string.answerFive);
            }
        });
        b_message3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText(R.string.answerSix);
            }
        });


    }
}
