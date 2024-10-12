package com.example.litecartesnative.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun Button(
    text: String,
    color: Color,
    backgroundColor: Color,
    borderColor: Color,
    shadowEnabled: Boolean = false,
    shadowColor: Color? = null,
    shadowHeight: Dp = 55.dp,
    icon: Painter? = null,
    onClick: () -> Unit = {},
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center
) {
    Box {
        if (shadowEnabled) {
            OutlinedButton(
                modifier = Modifier
                    .padding(5.dp)
                    .heightIn(min = shadowHeight)
                    .fillMaxWidth()
                    .shadow(
                        elevation = 8.dp,
                        shape = RoundedCornerShape(20.dp),
                        clip = false
                    ),
                onClick = onClick,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, borderColor),
                colors = ButtonDefaults.buttonColors(
                    containerColor = shadowColor!!
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
        OutlinedButton(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(20.dp),
                    clip = false
                ),
            onClick = onClick,
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
}