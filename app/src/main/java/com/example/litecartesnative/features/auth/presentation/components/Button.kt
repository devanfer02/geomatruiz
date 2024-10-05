package com.example.litecartesnative.features.auth.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.litecartesnative.R
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun Button(
    text: String,
    color: Color,
    backgroundColor: Color,
    borderColor: Color,
    icon: Painter? = null,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center
) {
    OutlinedButton(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, borderColor),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = horizontalArrangement,
            modifier = Modifier.fillMaxWidth() // Make the Row fill the width
        ){
            if (icon != null) {
                Image(
                    painter = icon,
                    contentDescription = ""
                )
                Spacer(
                    modifier = Modifier
                        .padding(
                            end = 18.dp
                        )
                )
            }
            Text(
                modifier = Modifier
                    .padding(vertical = 8.dp),
                text = text,
                color = color,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = nunitosFontFamily,
            )
        }
    }
}