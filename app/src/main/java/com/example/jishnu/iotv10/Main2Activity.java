package com.example.jishnu.iotv10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webview=(WebView) findViewById(R.id.webView);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                // Activities and WebViews measure progress with different scales.
                // The progress meter will automatically disappear when we reach 100%
                Main2Activity.this.setProgress(progress * 1000);
            }
        });





        webview.setWebViewClient(new WebViewClient());



        // webview.loadUrl("https://www.google.co.in");

        webview.loadUrl("http://webiopi:raspberry@192.168.0.101:8080");

    }



    @Override
    public void onBackPressed() {
        if (webview.canGoBack()){
            webview.goBack();
        }
        else {
            super.onBackPressed();

        }

    }

    }

