package com.woc.woc30_android_mid_evaluation_rutvi_sukhadia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String day = intent.getStringExtra(MainActivity.DAY);

        // Set text inside textview to message
        TextView textView = findViewById(R.id.txt_head);
        if(day.equalsIgnoreCase("Monday")) {
            textView.setText("Monday's Time table");
            textView = findViewById(R.id.txt_first);
            textView.setText("-");
            textView = findViewById(R.id.txt_second);
            textView.setText("Computer Networks");
            textView = findViewById(R.id.txt_third);
            textView.setText("Systems Programming");
            textView = findViewById(R.id.txt_lab);
            textView.setText("Object Oriented Programming Lab");
        }
        else if(day.equalsIgnoreCase("Tuesday")) {
            textView.setText("Tuesday's Time table");
            textView = findViewById(R.id.txt_first);
            textView.setText("Object Oriented Programming");
            textView = findViewById(R.id.txt_second);
            textView.setText("-");
            textView = findViewById(R.id.txt_third);
            textView.setText("Web Programming");
            textView = findViewById(R.id.txt_lab);
            textView.setText("Systems Programming Lab");
        }
        else if(day.equalsIgnoreCase("Wednesday")) {
            textView.setText("Wednesday's Time table");
            textView = findViewById(R.id.txt_first);
            textView.setText("Systems Programming");
            textView = findViewById(R.id.txt_second);
            textView.setText("-");
            textView = findViewById(R.id.txt_third);
            textView.setText("-");
            textView = findViewById(R.id.txt_lab);
            textView.setText("Computer Network Lab");
        }
        else if(day.equalsIgnoreCase("Thursday")) {
            textView.setText("Thursday's Time table");
            textView = findViewById(R.id.txt_first);
            textView.setText("Object Oriented Programming");
            textView = findViewById(R.id.txt_second);
            textView.setText("Software Engineering");
            textView = findViewById(R.id.txt_third);
            textView.setText("Computer Networks");
            textView = findViewById(R.id.txt_lab);
            textView.setText("Web Programming Lab");
        }
        else if(day.equalsIgnoreCase("Friday")) {
            textView.setText("Friday's Time table");
            textView = findViewById(R.id.txt_first);
            textView.setText("Web Programming");
            textView = findViewById(R.id.txt_second);
            textView.setText("Software Engineering");
            textView = findViewById(R.id.txt_third);
            textView.setText("-");
            textView = findViewById(R.id.txt_lab);
            textView.setText("Software Engineering Lab");
        }
        else if(day.equalsIgnoreCase("Saturday")) {
            textView.setText("Saturday's Time table");
            textView = findViewById(R.id.txt_first);
            textView.setText("-");
            textView = findViewById(R.id.txt_second);
            textView.setText("-");
            textView = findViewById(R.id.txt_third);
            textView.setText("-");
            textView = findViewById(R.id.txt_lab);
            textView.setText("-");
        }


    }


}