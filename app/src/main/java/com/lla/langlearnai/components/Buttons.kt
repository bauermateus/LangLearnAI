package com.lla.langlearnai.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun StandardRoundedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color =  MaterialTheme.colorScheme.primary,
    elevation: Dp = 4.dp,
    shape: Shape = RoundedCornerShape(12.dp),
    textStyle: TextStyle = TextStyle()
) {
    Button(
        onClick = { onClick() },
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        shape = shape,
        elevation = ButtonDefaults.buttonElevation(defaultElevation = elevation)
    ) {
        Text(text = text,
            style = textStyle)
    }
}