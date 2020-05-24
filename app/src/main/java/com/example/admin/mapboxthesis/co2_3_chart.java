package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class co2_3_chart extends AppCompatActivity {
    public WebView wv_co2_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co2_3_chart);

        wv_co2_3 = findViewById(R.id.co2_3_chart);

        WebSettings webSettings = wv_co2_3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvCO2_3.html";
        String file = path+name;
        wv_co2_3.loadUrl(file);

    }
}
