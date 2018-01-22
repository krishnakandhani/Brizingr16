package com.brizingr16gecr.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.brizingr16gecr.adapters.ImageListAdapter;
import com.brizingr16gecr.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    public static String[] urls = {
            "http://brizingr17.com/wp-content/uploads/2016/03/1-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/3-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/4-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/9-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/12-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/13-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/14-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/15-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/18-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/19-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/20-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/21-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/22-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/23-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/24-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/26-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/5-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/6-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/7-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/8-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/10-1024x683.jpg",
            "http://brizingr17.com/wp-content/uploads/2016/03/11-1024x683.jpg"
    };

    //"http://brizingr17.com/wp-content/uploads/2016/03/2-1024x683.jpg",
    // "http://brizingr17.com/wp-content/uploads/2016/03/16-1024x683.jpg",
    //"http://brizingr17.com/wp-content/uploads/2016/03/17-1024x683.jpg",
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getSupportActionBar().setTitle("Gallery");

        if (!Common.isNetworkAvailable(GalleryActivity.this)) {
            Common.noInternet(this);
        } else {
            Common.showToast(this, "Loading images from the internet may take a while");
        }


        List<String> list = Arrays.asList(urls);
        ArrayList<String> urlList = new ArrayList<String>();
        urlList.addAll(list);
        ListView imgList = (ListView) findViewById(R.id.imgList);
        ImageListAdapter adapter = new ImageListAdapter(this, R.layout.custom_img_row, urlList);
        imgList.setAdapter(adapter);


    }
}
