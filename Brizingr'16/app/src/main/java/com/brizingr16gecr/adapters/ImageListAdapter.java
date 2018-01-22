package com.brizingr16gecr.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.brizingr16gecr.activities.ImageViewerActivity;
import com.brizingr16gecr.R;

import java.util.ArrayList;

/**
 * Created by Naimish Rajput on 23-02-2016.
 */

public class ImageListAdapter extends ArrayAdapter<String>

{

    public ArrayList<String> imgArray;
    Context mContext;
    int rowId;

    public ImageListAdapter(Context mContext, int rowId, ArrayList<String> imgArray) {

        super(mContext, rowId);

        this.rowId = rowId;
        this.mContext = mContext;
        this.imgArray = imgArray;

    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, @NonNull ViewGroup parent) {

        /*
         * The convertView argument is essentially a "ScrapView" as described is Lucas post
         * http://lucasr.org/2012/04/05/performance-tips-for-androids-listview/
         * It will have a non-null value when ListView is asking you recycle the row layout.
         * So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
         */
        if (convertView == null) {
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(rowId, parent, false);
        }


        final String url = this.imgArray.get(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.img);
        Glide.with(mContext).load(url).diskCacheStrategy(DiskCacheStrategy.SOURCE).crossFade().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ImageViewerActivity.class);
                intent.putExtra("IMG_URL", url);
                mContext.startActivity(intent);

            }
        });
        // get the TextView and then set the text (item name) and tag (item ID) values
        // TextView Title = (TextView) convertView.findViewById(R.id.title);

        return convertView;

    }


    @Override
    public int getCount() {
        return this.imgArray.size();
    }
}
