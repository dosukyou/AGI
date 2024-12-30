package com.agifinance.webapp;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create WebView instance
        WebView webView = new WebView(this);
        setContentView(webView);

        // Enable JavaScript and other settings
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); // Enable DOM storage
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // No cache

        // Set WebViewClient to handle navigation
        webView.setWebViewClient(new WebViewClient());

        // Optional: Add a WebChromeClient to handle JavaScript dialogs, etc.
        webView.setWebChromeClient(new WebChromeClient());

        // Load your URL
        webView.loadUrl("https://www.vizhole.com/report/");
    }
}
