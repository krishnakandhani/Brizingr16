package com.brizingr16gecr.activities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by Naimish Rajput on 23-02-2016.
 */

public class Common {

    public static void showToast(Context ct, String message) {

        Toast.makeText(ct, message, Toast.LENGTH_LONG).show();
    }

    public static void noInternet(Context ct) {

        showToast(ct, "Some images may not be loaded because of unavailability of internet");
    }

    public static boolean isNetworkAvailable(Context ct) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) ct.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager
                .getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();

    }
}