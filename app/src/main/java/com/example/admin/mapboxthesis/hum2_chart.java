package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class hum2_chart extends AppCompatActivity {
    public WebView wv_hum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hum2_chart);
        wv_hum2 = findViewById(R.id.hum2);

        WebSettings webSettings = wv_hum2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvHum2.html";
        String file = path+name;
        wv_hum2.loadUrl(file);
    }
}
