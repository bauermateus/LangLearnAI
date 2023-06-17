package com.lla.langlearnai.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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
fun SkillSelectionScreen(navController: NavController) {
    val list = listOf(
        stringResource(id = R.string.writing),
        stringResource(id = R.string.reading),
        stringResource(id = R.string.speaking),
        stringResource(id = R.string.listening),
        stringResource(id = R.string.all)
    )
    val selectedOption = remember { mutableStateOf(list.first()) }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onBackground
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Padding.TOP_PAGE_STANDARD),
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.what_to_learn_first_header),
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            Spacer(modifier = Modifier.height(64.dp))
            SkillChooseCard(list, selectedOption)
            Spacer(modifier = Modifier.height(64.dp))
            StandardRoundedButton(
                text = stringResource(id = R.string.next),
                textStyle = TextStyle(
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(horizontal = 32.dp),
                onClick = { navController.navigate(LoginActivityScreens.ReasonToLearnScreen.name + "/${selectedOption.value}") })
        }
    }
}

@Composable
fun SkillChooseCard(list: List<String>, selectedOption: MutableState<String>) {

    list.forEach { option ->

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Center
        ) {
            OutlinedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 64.dp)
                    .selectable(
                        selected = (option == selectedOption.value),
                        onClick = { selectedOption.value = option }
                    ),
                colors = CardDefaults
                    .outlinedCardColors(containerColor = if (option == selectedOption.value) MaterialTheme.colorScheme.tertiary else MaterialTheme.colorScheme.background)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    text = option,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        color = if (option == selectedOption.value) MaterialTheme.colorScheme.onTertiary else MaterialTheme.colorScheme.onBackground,
                        fontSize = 28.sp
                    )
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}

@Composable
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL)
fun SkillSelectionPreview() {
    LangLearnAITheme {
        SkillSelectionScreen(navController = NavController(LocalContext.current))
    }
}