package com.sample.foo.simplerssreader;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private String mUrl;

    public static Intent newIntent(Context packageContext, String url) {
        Intent intent = new Intent(packageContext, WebViewActivity.class);
        intent.putExtra("URL",url);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = (WebView) findViewById(R.id.web_view);
        mUrl= getIntent().getStringExtra("URL");
        webView.loadUrl(mUrl);
    }
}
