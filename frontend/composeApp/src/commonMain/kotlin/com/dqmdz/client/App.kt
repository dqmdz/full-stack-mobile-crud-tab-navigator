package com.dqmdz.client

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.dqmdz.client.screens.MainNavigationScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(
            screen = MainNavigationScreen()
        )
    }
}
