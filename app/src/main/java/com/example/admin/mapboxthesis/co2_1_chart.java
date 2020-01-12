package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class co2_1_chart extends AppCompatActivity {
    public WebView wv_co2_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co2_1_chart);

        wv_co2_1 = findViewById(R.id.co2_1_chart);

        WebSettings webSettings = wv_co2_1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvCO2_1.html";
        String file = path+name;
        wv_co2_1.loadUrl(file);
    }
}
