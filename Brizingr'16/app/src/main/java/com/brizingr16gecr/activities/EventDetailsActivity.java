package com.brizingr16gecr.activities;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.brizingr16gecr.bean.Detail;
import com.brizingr16gecr.R;

public class EventDetailsActivity extends AppCompatActivity {

    TextView desc, levels, rules, resources, time, place, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_custom_event_details);
        init();

        Bundle bundle = getIntent().getExtras();
        final Detail detail = (Detail) bundle.getSerializable("Object");

        getSupportActionBar().setTitle(detail.getHeading());
        desc.setText(detail.getDescription());
        levels.setText(detail.getLevels());
        rules.setText(detail.getRules());
        resources.setText(detail.getResources());
        time.setText(detail.getEvent_time());
        place.setText(detail.getPlace());
        contact.setText("Call " + detail.getCoord_name());
        contact.setPaintFlags(contact.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", detail.getContact_no(), null));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }

    public void init() {
        desc = (TextView) findViewById(R.id.event_desc);
        levels = (TextView) findViewById(R.id.event_levels);
        rules = (TextView) findViewById(R.id.event_rules);
        resources = (TextView) findViewById(R.id.event_res);
        time = (TextView) findViewById(R.id.event_time_view);
        place = (TextView) findViewById(R.id.event_place_view);
        contact = (TextView) findViewById(R.id.event_contact_view);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
