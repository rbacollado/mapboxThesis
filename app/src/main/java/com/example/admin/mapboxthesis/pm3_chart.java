package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class pm3_chart extends AppCompatActivity {
    public WebView wv_pm3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm3_chart);

        wv_pm3 = findViewById(R.id.pm3_chart);

        WebSettings webSettings = wv_pm3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvPM3.html";
        String file = path+name;
        wv_pm3.loadUrl(file);
    }
}
