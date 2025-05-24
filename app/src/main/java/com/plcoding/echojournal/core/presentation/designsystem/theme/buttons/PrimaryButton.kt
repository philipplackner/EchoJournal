package com.plcoding.echojournal.core.presentation.designsystem.theme.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.echojournal.core.presentation.designsystem.theme.EchoJournalTheme
import com.plcoding.echojournal.core.presentation.designsystem.theme.buttonGradient

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    // Material3 btn
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Green,
            containerColor = Color.Yellow,
        ),
        modifier = modifier
            .background(
                brush = if (isEnabled) MaterialTheme.colorScheme.buttonGradient
                else SolidColor(MaterialTheme.colorScheme.onSurfaceVariant)
            ),
        shape = CircleShape,
    ) {
        leadingIcon?.invoke()

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = if (isEnabled) MaterialTheme.colorScheme.onPrimary
            else MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    EchoJournalTheme {

        PrimaryButton(
            text = "Primary Button",
            onClick = {},
            isEnabled = false,
            modifier = Modifier,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        )

    }
}