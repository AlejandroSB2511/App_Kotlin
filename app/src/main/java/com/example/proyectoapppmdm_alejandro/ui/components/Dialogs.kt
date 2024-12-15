package com.example.proyectoapppmdm_alejandro.ui.components

import android.app.AlertDialog
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import com.example.proyectoapppmdm_alejandro.R

@Composable
fun DeleteDialog(
    name: String,
    onConfirm: () -> Unit,
    onCancel: () -> Unit
) {
    AlertDialog(
        title = {Text(stringResource(R.string.delete_character))},
        text = {Text(stringResource(R.string.delete_character2,name))},
        onDismissRequest = {onCancel()},
        confirmButton = {
            TextButton(onClick = onConfirm) {
                Text(stringResource(R.string.confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onCancel) {
                Text(stringResource(R.string.cancel))
            }
        }

    )
}
