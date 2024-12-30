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

        WebView webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.clearCache(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); // Enable DOM storage
        webSettings.setAppCacheEnabled(true); // Enable app cache
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW); // Allow mixed content

        webView.loadUrl("https://www.vizhole.com/report/");
        setContentView(webView);
    }
}
