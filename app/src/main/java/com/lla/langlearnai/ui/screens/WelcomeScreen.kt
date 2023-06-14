package com.lla.langlearnai.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lla.langlearnai.R
import com.lla.langlearnai.components.StandardRoundedButton
import com.lla.langlearnai.navigation.LoginActivityScreens
import com.lla.langlearnai.ui.theme.LangLearnAITheme
import com.lla.langlearnai.ui.theme.Padding

@Composable
fun WelcomeScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Padding.TOP_PAGE_STANDARD),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.welcome_screen_header, stringResource(R.string.app_name)),
                style = TextStyle(
                    fontSize = 48.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(100.dp))
            Image(painter = painterResource(id = R.drawable.iconeprovisorio), contentDescription = "App Icon")
            Spacer(modifier = Modifier.height(100.dp))
            StandardRoundedButton(
                text = "Começe agora",
                textStyle = TextStyle(fontSize = 32.sp, color = MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(horizontal = 32.dp),
                onClick = { navController.navigate(LoginActivityScreens.SkillSelectionScreen.name) })
            Spacer(modifier = Modifier.height(16.dp))
            StandardRoundedButton(
                text = "Entrar",
                textStyle = TextStyle(fontSize = 32.sp, color = MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(horizontal = 32.dp),
                onClick = { /* TODO() */ })
        }
    }
}

@Composable
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL)
fun Preview() {
    LangLearnAITheme {
        WelcomeScreen(navController = NavController(LocalContext.current))
    }
}