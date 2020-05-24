package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class co2_chart extends AppCompatActivity {
    public WebView wv_co2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co2_chart);

        wv_co2 = findViewById(R.id.co2);

        WebSettings webSettings = wv_co2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvCO2.html";
        String file = path+name;
        wv_co2.loadUrl(file);
    }
}
