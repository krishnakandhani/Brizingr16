package com.brizingr16gecr.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.brizingr16gecr.R;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        getSupportActionBar().setTitle("Schedule");
    }
}
