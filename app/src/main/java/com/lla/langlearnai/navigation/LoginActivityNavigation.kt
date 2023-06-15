package com.lla.langlearnai.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lla.langlearnai.ui.screens.LoginScreen
import com.lla.langlearnai.ui.screens.SkillSelectionScreen
import com.lla.langlearnai.ui.screens.WelcomeScreen

@Composable
fun LoginActivityNavigation() {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = LoginActivityScreens.WelcomeScreen.name) {
        composable(LoginActivityScreens.WelcomeScreen.name) {
            WelcomeScreen(navController = navController)
        }
        composable(LoginActivityScreens.SkillSelectionScreen.name) {
            SkillSelectionScreen(navController = navController)
        }
        composable(LoginActivityScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
    }
}