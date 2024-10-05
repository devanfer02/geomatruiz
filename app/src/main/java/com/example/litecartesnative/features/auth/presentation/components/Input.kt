package com.example.litecartesnative.features.auth.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun Input(
    value: String,
    label: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
                color = LitecartesColor.Secondary,
                fontFamily = nunitosFontFamily,
                fontWeight = FontWeight.SemiBold
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = LitecartesColor.Secondary,
            unfocusedBorderColor = LitecartesColor.Secondary
        ),

        shape = RoundedCornerShape(16.dp)
    )
}