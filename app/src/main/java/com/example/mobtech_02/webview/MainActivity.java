package com.example.mobtech_02.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        WebView webpage = (WebView) findViewById(R.id.mWebView);
        webpage.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webpage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setSupportMultipleWindows(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setAllowFileAccess(true);
        webpage.setWebChromeClient(new WebChromeClient());
//        webpage.loadUrl("http://www.rbsk-karnataka.com/");
     //   webpage.loadUrl("https://www.youtube.com");
        Toast.makeText(MainActivity.this, "latitude logitudes are hotcode values", Toast.LENGTH_SHORT).show();
        webpage.loadUrl("http://maps.google.com/maps?" + "saddr=43.0054446,-87.9678884" + "&daddr=42.9257104,-88.0508355");
      /*    webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);*/
/*
        String customHtml = "<html><head><title>Sample</title></head><body><video controls><source src='http://www.vinformax.com/vts/texin-launcher/assets/imgs/upload/amarjothitest_file.mp4'></video></body></html>";
        displayYoutubeVideo.loadData(customHtml, "text/html", "UTF-8");*/

     ///http://www.vinformax.com/vts/texin-launcher/assets/imgs/upload/amarjothitest_file.mp4


       /* String frameVideo = "<html><body>Video From YouTube<br><iframe width=\"420\" height=\"315\" src=\"http://www.broken-links.com/tests/media/BigBuck.m4v\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo = (WebView) findViewById(R.id.mWebView);
        displayYoutubeVideo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
