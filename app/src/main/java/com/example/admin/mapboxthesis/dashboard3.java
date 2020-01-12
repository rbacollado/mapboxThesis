package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class dashboard3 extends AppCompatActivity {
    public WebView wv_dshbrd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard3);

        wv_dshbrd3 = findViewById(R.id.dashboard3);

        WebSettings webSettings = wv_dshbrd3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvDashboard3.html";
        String file = path+name;
        wv_dshbrd3.loadUrl(file);

    }
}
