package com.brizingr16gecr.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.brizingr16gecr.R;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        getSupportActionBar().setTitle("Contact us");
    }
}
