package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class co3_chart extends AppCompatActivity {
    public WebView wv_co3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co3_chart);

        wv_co3 = findViewById(R.id.co3_chart);

        WebSettings webSettings = wv_co3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvCO3.html";
        String file = path+name;
        wv_co3.loadUrl(file);
    }
}
