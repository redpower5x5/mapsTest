package com.practise.aionixx.mapstest;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView browser = new WebView(this);
        browser.setWebViewClient(new MyWebViewClient());
        setContentView(browser);
        browser.loadUrl("http://metanit.com");



    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

class MyWebViewClient extends WebViewClient {
    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return true;
    }


}

