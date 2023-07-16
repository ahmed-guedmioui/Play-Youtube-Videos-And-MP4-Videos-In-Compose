package com.ahmed.xmlincompose

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import com.ahmed.xmlincompose.ui.theme.XMLViewsInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val videoUri =
                Uri.parse("android.resource://com.ahmed.xmlincompose/raw/video")

            XMLViewsInComposeTheme {
                Column {
                    YoutubePlayer(
                        youtubeVideoId = "Aey3_l-nyV0",
                        lifecycleOwner = LocalLifecycleOwner.current
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    VideoPlayer(videoUri = videoUri)

                }

            }
        }
    }
}

