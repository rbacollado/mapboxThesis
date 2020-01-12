package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class temp1_chart extends AppCompatActivity {

    public WebView wv_temp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_temp1_chart);

        wv_temp1 = findViewById(R.id.temp1_chart);

        WebSettings webSettings = wv_temp1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvTemp1.html";
        String file = path+name;
        wv_temp1.loadUrl(file);

    }
}
