package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class pm2_chart extends AppCompatActivity {
    public WebView wv_pm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm2_chart);

        wv_pm2 = findViewById(R.id.pm2);

        WebSettings webSettings = wv_pm2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvPM2.html";
        String file = path+name;
        wv_pm2.loadUrl(file);
    }
}
