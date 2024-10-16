package com.example.litecartesnative.features.quiz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.litecartesnative.R
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun BoxPoints(
    imageId: Int,
    points: String
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .shadow(
                elevation = 8.dp,
                clip = false,
                shape = RoundedCornerShape(20.dp)
            )
            .background(LitecartesColor.Surface)
            .padding(
                horizontal = 4.dp,
                vertical = 2.dp
            )
,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "diamond",
            modifier = Modifier
                .size(18.dp)
        )
        Text(
            text = "$points",
            fontFamily = nunitosFontFamily,
            color = LitecartesColor.Secondary,
            fontWeight = FontWeight.SemiBold,
        )
    }
}