package com.example.admin.mapboxthesis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class co1_chart extends AppCompatActivity {

    public WebView wv_co1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co1_chart);

        wv_co1 = findViewById(R.id.co1_chart);

        WebSettings webSettings = wv_co1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvCO1.html";
        String file = path+name;
        wv_co1.loadUrl(file);
    }
}
