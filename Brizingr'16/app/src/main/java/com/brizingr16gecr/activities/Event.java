package com.brizingr16gecr.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.brizingr16gecr.R;

public class Event extends AppCompatActivity implements Button.OnClickListener {

    Button dashboard_btn_nontech,
            dashboard_btn_ec,
            dashboard_btn_ic,
            dashboard_btn_auto,
            dashboard_btn_civil,
            dashboard_btn_mech,
            dashboard_btn_comp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        getSupportActionBar().setTitle("Events");

        dashboard_btn_auto = (Button) findViewById(R.id.dashboard_btn_auto);
        dashboard_btn_comp = (Button) findViewById(R.id.dashboard_btn_about_comp);
        dashboard_btn_mech = (Button) findViewById(R.id.dashboard_btn_mecht);
        dashboard_btn_civil = (Button) findViewById(R.id.dashboard_btn_civil);
        dashboard_btn_ic = (Button) findViewById(R.id.dashboard_btn_ic);
        dashboard_btn_ec = (Button) findViewById(R.id.dashboard_btn_ec);
        dashboard_btn_nontech = (Button) findViewById(R.id.dashboard_btn_nontech);

        dashboard_btn_auto.setOnClickListener(this);
        dashboard_btn_comp.setOnClickListener(this);
        dashboard_btn_mech.setOnClickListener(this);
        dashboard_btn_civil.setOnClickListener(this);
        dashboard_btn_ic.setOnClickListener(this);
        dashboard_btn_ec.setOnClickListener(this);
        dashboard_btn_nontech.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, DisplayEvent.class);
        intent.putExtra("DeptName", v.getId());
        startActivity(intent);
    }
}
