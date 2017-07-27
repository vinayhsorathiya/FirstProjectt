package com.example.android.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        setTitle("SmartHome");

        wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("file:///android_asset/shree.html");
//        wv.loadUrl("http://www.google.com");

    }
}
