package com.example.izhevsk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.example.izhevsk.ui.screens.IzhevskApp
import com.example.izhevsk.ui.theme.IzhevskTheme
import com.example.izhevsk.viewmodel.IzhevskViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: IzhevskViewModel by viewModels()

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            IzhevskTheme {
                IzhevskApp(viewModel = viewModel, windowSizeClass = windowSizeClass)
            }
        }
    }
}
