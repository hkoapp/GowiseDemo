package org.hko.gowise.gowisedemo.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import org.hko.gowise.gowisedemo.R;

public class GowiseWebview extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gowise_webview);
        mWebView = (WebView) findViewById(R.id.activity_gowise_webview);

        mWebView.setWebViewClient(new MyAppWebViewClient());
        mWebView.setInitialScale(1);

        //Enable JavaScript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        mWebView.loadUrl("http://gowise2.hko.ccgo.hksarg/nindex.php?lang=zh-hk&nologin=true");
    }

    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

