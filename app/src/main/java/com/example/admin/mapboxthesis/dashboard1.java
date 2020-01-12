package com.example.admin.mapboxthesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class dashboard1 extends AppCompatActivity {

    public WebView wv_dshbrd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard1);

        wv_dshbrd1 = findViewById(R.id.dshbrd_1);

        WebSettings webSettings = wv_dshbrd1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvDashboard1.html";
        String file = path+name;
        wv_dshbrd1.loadUrl(file);
    }
}
