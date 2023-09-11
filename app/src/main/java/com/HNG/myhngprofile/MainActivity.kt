package com.HNG.myhngprofile

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.HNG.myhngprofile.ui.theme.MyHNGProfileTheme


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewID: WebView = findViewById(R.id.webview_id2)
        val button: Button = findViewById(R.id.github_profile_button)
        webViewID.webViewClient = WebViewClient()
        button.setOnClickListener {
           // val intent = Intent(this, WebviewActivity::class.java)
            webViewID.apply {
                loadUrl("https://www.github.com/JosiahUfono")
                settings.javaScriptEnabled = true
                settings.safeBrowsingEnabled = true
            }
           // startActivity(intent)
        }


    }

}