package ru.mirea.tabolskayaea.mireaproject;

import android.webkit.WebView;
import android.webkit.WebViewClient;


public class myWebClient extends WebViewClient {


    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}