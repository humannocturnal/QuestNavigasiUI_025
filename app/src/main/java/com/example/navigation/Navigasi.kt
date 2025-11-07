package com.example.navigation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier
import java.nio.file.WatchEvent

enum class Navigasi {
    Formulirku,
    Detail
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {

    Scaffold { isiRuang ->

        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {

        }
    }
}