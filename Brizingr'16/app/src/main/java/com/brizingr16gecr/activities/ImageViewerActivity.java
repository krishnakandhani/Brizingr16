package com.brizingr16gecr.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.brizingr16gecr.R;

public class ImageViewerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        ImageView imageView = (ImageView) findViewById(R.id.imgFull);
        String url = getIntent().getStringExtra("IMG_URL");
        Glide.with(this).load(url).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(imageView);
    }
}
