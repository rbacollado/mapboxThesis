package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class pm_chart extends AppCompatActivity {

    public WebView wv_pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm_chart);

        wv_pm = findViewById(R.id.pm_chart);

        WebSettings webSettings = wv_pm.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvPM.html";
        String file = path+name;
        wv_pm.loadUrl(file);
    }
}
