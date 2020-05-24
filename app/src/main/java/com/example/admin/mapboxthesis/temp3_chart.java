package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class temp3_chart extends AppCompatActivity {
    public WebView wv_temp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp3_chart);

        wv_temp3 = findViewById(R.id.temp3_chart);

        WebSettings webSettings = wv_temp3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvTemp3.html";
        String file = path+name;
        wv_temp3.loadUrl(file);
    }
}
