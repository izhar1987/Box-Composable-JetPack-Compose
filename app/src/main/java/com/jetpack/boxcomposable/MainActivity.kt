package com.jetpack.boxcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Box Composable is Similar to Frame layout
            BoxComposable()
        }
    }

    @Preview(showBackground = true, widthDp = 300, heightDp = 500)
    @Composable
    private fun BoxComposable() {
        Box(contentAlignment =  Alignment.Center){
            Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
            Image(painter = painterResource(id = R.drawable.arrow), contentDescription = "")
        }
    }
}