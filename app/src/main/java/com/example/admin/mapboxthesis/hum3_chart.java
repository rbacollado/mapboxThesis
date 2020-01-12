package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class hum3_chart extends AppCompatActivity {
    public WebView wv_hum3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hum3_chart);
        wv_hum3 = findViewById(R.id.hum3_chart);

        WebSettings webSettings = wv_hum3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvHum3.html";
        String file = path+name;
        wv_hum3.loadUrl(file);
    }
}
