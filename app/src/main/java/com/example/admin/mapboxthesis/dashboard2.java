package com.example.admin.mapboxthesis;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class dashboard2 extends AppCompatActivity {
    public WebView wv_dshbrd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);

        wv_dshbrd2 = findViewById(R.id.dashboard2);

        WebSettings webSettings = wv_dshbrd2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String path = "file:android_asset/";
        String name = "wvDashboard2.html";
        String file = path+name;
        wv_dshbrd2.loadUrl(file);
    }
}
