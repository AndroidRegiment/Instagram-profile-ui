package com.xtremedevx.insta.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Verified
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.xtremedevx.insta.ui.theme.LightBlue

@Preview
@Composable
fun FollowButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(backgroundColor = LightBlue),

        ) {
        Text(
            text = "Follow",
            color = Color.White
        )
    }
}

@Composable
fun ShowUserNameWithVerified(userName: String, isVerified: Boolean) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(userName)
        if (isVerified) {
            Icon(
                imageVector = Icons.Filled.Verified,
                contentDescription = null,
                tint = LightBlue
            )
        }
    }
}

