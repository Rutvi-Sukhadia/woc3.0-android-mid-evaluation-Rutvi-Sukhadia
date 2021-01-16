package com.woc.woc30_android_mid_evaluation_rutvi_sukhadia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static String DAY="com.woc.android_timetable.DAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimeTable(View view)
    {
        Intent intent = new Intent(this, SubActivity.class);
        String day="";
        if(findViewById(R.id.btn_mon) == view)
        {
            day = "Monday";
        }
        else if(findViewById(R.id.btn_tues) == view)
        {
            day = "Tuesday";
        }
        else if(findViewById(R.id.btn_we) == view)
        {
            day = "Wednesday";
        }
        else if(findViewById(R.id.btn_thurs) == view)
        {
            day = "Thursday";
        }
        if(findViewById(R.id.btn_fri) == view)
        {
            day = "Friday";
        }
        else if(findViewById(R.id.btn_sat) == view)
        {
            day = "Saturday";
        }
        intent.putExtra(DAY, day);
        startActivity(intent);
    }
}