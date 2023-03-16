package com.ptut.poomler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.core.view.WindowCompat
import com.ptut.poomler.ui.theme.PoomLerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            PoomLerTheme {
                Surface {
                    Text(text = "")
                }
            }
        }
    }
}

