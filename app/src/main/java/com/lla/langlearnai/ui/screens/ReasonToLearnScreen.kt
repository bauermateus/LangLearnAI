package com.lla.langlearnai.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ReasonToLearnScreen(
    navController: NavController, skill: String?
) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        if (skill != null) {
            Text(text = skill)
        }
    }
}