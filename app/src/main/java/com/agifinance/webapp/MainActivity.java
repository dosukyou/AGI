package com.agifinance.webapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.setWebViewClient(
        	new WebViewClient() {
            	@Override
            	public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                	// Show a custom error message or retry
                	view.loadData("<html><body><h3>Page not available</h3></body></html>", "text/html", "UTF-8");
            	}
            }
        );
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.vizhole.com/report/");
        setContentView(webView);
    }
}
