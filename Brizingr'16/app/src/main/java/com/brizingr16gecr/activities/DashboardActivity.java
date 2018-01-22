package com.brizingr16gecr.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.brizingr16gecr.R;

public class DashboardActivity extends AppCompatActivity {

    Button dashboard_btn_about_brizingr;
    Button dashboard_btn_event;
    Button dashboard_btn_seminar;
    Button dashboard_btn_schedule;
    Button dashboard_btn_sponsor;
    Button dashboard_btn_contact_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper);
        ViewFlipper flipper1 = (ViewFlipper) findViewById(R.id.flipper2);
        flipper.startFlipping();
        flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.flipper_in));
        flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.flipper_out));

        flipper1.startFlipping();
        flipper1.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.bottom_down));
        flipper1.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.bottom_up));


        EventsArray.setArrays(getApplicationContext());

        dashboard_btn_about_brizingr = (Button) findViewById(R.id.dashboard_btn_about_brizingr);
        dashboard_btn_event = (Button) findViewById(R.id.dashboard_btn_event);
        dashboard_btn_seminar = (Button) findViewById(R.id.dashboard_btn_seminar);
        dashboard_btn_schedule = (Button) findViewById(R.id.dashboard_btn_schedule);
        //dashboard_btn_sponsor = (Button) findViewById(R.id.dashboard_btn_sponsor);
        dashboard_btn_contact_us = (Button) findViewById(R.id.dashboard_btn_contact_us);


        dashboard_btn_about_brizingr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(DashboardActivity.this, AboutBrizingr.class);
                startActivity(in);
            }
        });

        dashboard_btn_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, Event.class);
                startActivity(i);
            }
        });

        dashboard_btn_seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(DashboardActivity.this, GalleryActivity.class);
                startActivity(in);
            }
        });

        dashboard_btn_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, ContactUs.class);
                startActivity(i);
            }
        });



        dashboard_btn_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, Schedule.class);
                startActivity(i);
            }
        });

    }
}
