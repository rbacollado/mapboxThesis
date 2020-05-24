package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class hum1_chart extends AppCompatActivity {

    public WebView wv_hum1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hum1_chart);

        wv_hum1 = findViewById(R.id.hum1_chart);

        WebSettings webSettings = wv_hum1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvHum1.html";
        String file = path+name;
        wv_hum1.loadUrl(file);
    }


}
