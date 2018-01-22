package com.brizingr16gecr.activities;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;

import com.brizingr16gecr.R;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen easySplashScreenView = new EasySplashScreen(SplashActivity.this)
                .withFullScreen()
                .withTargetActivity(DashboardActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundResource(R.color.splash)
                .withFooterText("")
                .withBeforeLogoText("Government Engineering College,Rajkot")
                .withLogo(R.drawable.geclogo)
                .withAfterLogoText("Presents")
                .withFooterText(" Brizingr 2016\n");

        Typeface typeface = Typeface.createFromAsset(getAssets(), "Redressed.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "HeadlineFont.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "Somatic.otf");

        easySplashScreenView.getBeforeLogoTextView().setTextColor(Color.BLACK);
        easySplashScreenView.getBeforeLogoTextView().setTextAppearance(this, android.R.style.TextAppearance_Large);
        easySplashScreenView.getBeforeLogoTextView().setTypeface(typeface);

        easySplashScreenView.getAfterLogoTextView().setTextColor(Color.BLACK);
        easySplashScreenView.getAfterLogoTextView().setTextAppearance(this, android.R.style.TextAppearance_Medium);
        easySplashScreenView.getAfterLogoTextView().setTypeface(typeface1);

        easySplashScreenView.getFooterTextView().setTextColor(Color.BLUE);
        easySplashScreenView.getFooterTextView().setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        easySplashScreenView.getFooterTextView().setTypeface(typeface2);


        View view = easySplashScreenView.create();

        setContentView(view);
    }
}
