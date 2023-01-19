package com.harunbekcan.cleanarchitecturecomposeproject.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.harunbekcan.cleanarchitecturecomposeproject.navigation.NavGraph
import com.harunbekcan.cleanarchitecturecomposeproject.ui.theme.CleanArchitectureComposeProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureComposeProjectTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}