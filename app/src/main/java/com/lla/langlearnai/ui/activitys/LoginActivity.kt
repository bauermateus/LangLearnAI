package com.lla.langlearnai.ui.activitys

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lla.langlearnai.navigation.LoginActivityNavigation
import com.lla.langlearnai.ui.theme.LangLearnAITheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LangLearnAITheme {
                LoginActivityNavigation()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    LangLearnAITheme {
        LoginActivityNavigation()
    }
}
