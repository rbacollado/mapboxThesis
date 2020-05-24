package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class temp2_chart extends AppCompatActivity {
    public WebView wv_temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2_chart);

        wv_temp2 = findViewById(R.id.temp2);

        WebSettings webSettings = wv_temp2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvTemp2.html";
        String file = path+name;
        wv_temp2.loadUrl(file);
    }
}
