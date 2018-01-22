package com.brizingr16gecr.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.brizingr16gecr.adapters.adapter;
import com.brizingr16gecr.bean.Detail;
import com.brizingr16gecr.R;

import java.util.ArrayList;

public class DisplayEvent extends AppCompatActivity {

    public ListView listView;
    public adapter mAdapter;
    ArrayList<Detail> eventArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_event);

        int id = getIntent().getExtras().getInt("DeptName");
        String dept_name = "";
        switch (id) {
            case R.id.dashboard_btn_about_comp:
                eventArray = EventsArray.comp_array;
                dept_name = "C - Geeks";
                break;
            case R.id.dashboard_btn_civil:
                eventArray = EventsArray.civil_array;
                dept_name = "Civilions";
                break;
            case R.id.dashboard_btn_auto:
                eventArray = EventsArray.auto_array;
                dept_name = "Automs";
                break;
            case R.id.dashboard_btn_ec:
                eventArray = EventsArray.ec_array;
                dept_name = "Transfiers";
                break;
            case R.id.dashboard_btn_mecht:
                eventArray = EventsArray.mech_array;
                dept_name = "Mechstars";
                break;
            case R.id.dashboard_btn_ic:
                eventArray = EventsArray.ic_array;
                dept_name = "Controllers";
                break;
            case R.id.dashboard_btn_nontech:
                eventArray = EventsArray.non_tech_array;
                dept_name = "Non Technical";
                break;
            default:
                eventArray = null;
        }

        getSupportActionBar().setTitle(dept_name);


        mAdapter = new adapter(this, R.layout.my_custom_event_list, eventArray);
        listView = (ListView) findViewById(R.id.display_event_lv);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), EventDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Object", eventArray.get(position));
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
