package com.lla.langlearnai.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lla.langlearnai.components.SimpleOutlinedTextFieldSample
import com.lla.langlearnai.components.StandardRoundedButton
import com.lla.langlearnai.navigation.LoginActivityScreens
import com.lla.langlearnai.ui.theme.LangLearnAITheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(
                text = "Login",
                color = MaterialTheme.colorScheme.onPrimary,
                textAlign = TextAlign.Center
            )
        }, navigationIcon = {
            IconButton(onClick = { navController.navigate(LoginActivityScreens.WelcomeScreen.name)}) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }, colors = TopAppBarDefaults.largeTopAppBarColors(MaterialTheme.colorScheme.primary))
    }) {
        Surface(
            modifier = Modifier
                .padding(it)
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(50.dp))
                SimpleOutlinedTextFieldSample(label = "Email", modifier = Modifier.fillMaxWidth(0.8f))
                Spacer(modifier = Modifier.height(28.dp))
                SimpleOutlinedTextFieldSample(label = "Password", modifier = Modifier.fillMaxWidth(0.8f), textStyle = TextStyle.Default, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))
                Spacer(modifier = Modifier.height(28.dp))
                StandardRoundedButton(
                    text = "Entrar",
                    textStyle = TextStyle(fontSize = 20.sp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(100.dp)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Esqueceu sua senha?", fontSize = 18.sp, color = MaterialTheme.colorScheme.primary)
            }

        }

    }
}

@Composable
@Preview
fun PreviewLoginScreen() {
    LangLearnAITheme {
        LoginScreen(navController = NavController(LocalContext.current))
    }

}
