package com.brizingr16gecr.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.brizingr16gecr.bean.Detail;
import com.brizingr16gecr.R;

import java.util.ArrayList;

/**
 * Created by Naimish Rajput on 19-02-2016.
 */

public class adapter extends ArrayAdapter<Detail>

{

    public ArrayList<Detail> vArray;
    int c;
    Context mContext;
    int rowId;
    private int[] colors;

    public adapter(Context mContext, int rowId, ArrayList<Detail> vArray) {

        super(mContext, rowId);

        this.rowId = rowId;
        this.mContext = mContext;
        this.vArray = vArray;
        colors = new int[vArray.size()];

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

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


        final Detail vItem = this.vArray.get(position);

        // get the TextView and then set the text (item name) and tag (item ID) values
        // TextView Title = (TextView) convertView.findViewById(R.id.title);
        TextView heading = (TextView) convertView.findViewById(R.id.my_event_heading);


        if (colors[position] == 0)
            colors[position] = getRandomColor();
        heading.setBackgroundColor(colors[position]);

        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "HeadlineFont.ttf");
        heading.setTypeface(typeface);

        heading.setText(vItem.getHeading());
        return convertView;

    }


    private int getRandomColor() {

        int[] colors1 = new int[]{Color.parseColor("#AB47BC"), Color.parseColor("#558B2F"), Color.parseColor("#EF6C00"), Color.parseColor("#6D4C41")};
        int[] colors = new int[]{Color.parseColor("#F44336"), Color.parseColor("#009688"), Color.parseColor("#9C27B0"), Color.parseColor("#2196F3")};

        if (c == 0) {
            c++;
            return colors[0];

        } else if (c == 1) {
            c++;
            return colors[1];
        } else if (c == 2) {
            c++;
            return colors[2];
        } else {
            c = 0;
            return colors[3];
        }

    }

    @Override
    public int getCount() {
        return this.vArray.size();
    }
}