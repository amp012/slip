/*
Create an android application that opens the website www.google.com in the browser on the click of a
button using intents
 */

package com.mohsin.webviewcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    TextView txtNoInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new MyBrowser());
        txtNoInternet = findViewById(R.id.txtNoInternet);

        if (isNetWork()) {
            txtNoInternet.setVisibility(View.GONE);
            webView.setVisibility(View.VISIBLE);

            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            webView.loadUrl("https://www.google.com/");

        } else {
            txtNoInternet.setVisibility(View.VISIBLE);
            webView.setVisibility(View.GONE);
        }
    }

    private boolean isNetWork() {
        boolean is_wifi = false, is_mobile_data = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos;
        networkInfos = connectivityManager.getAllNetworkInfo();
        for (NetworkInfo info : networkInfos) {
            if (info.getTypeName().equalsIgnoreCase("WIFI")) {
                if (info.isConnected()) {
                    is_wifi = true;
                }
            }
            if (info.getTypeName().equalsIgnoreCase("MOBILE DATA")) {
                if (info.isConnected()) {
                    is_mobile_data = true;
                }
            }
        }
        return is_wifi || is_mobile_data;
    }
}
class MyBrowser extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}