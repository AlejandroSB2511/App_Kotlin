package com.example.proyectoapppmdm_alejandro.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.compose.LocalExtendedColorScheme
import com.example.proyectoapppmdm_alejandro.R
import com.example.proyectoapppmdm_alejandro.model.Character

@Composable
fun MedHeaderComp(title: String,modifier: Modifier = Modifier) {
    val extendedColorScheme = LocalExtendedColorScheme.current

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary),
        shadowElevation = 1.dp,
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.primary
    ) {
        Row {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.List,
                modifier = Modifier.size(48.dp),
                contentDescription = stringResource(R.string.opciones),
                tint = MaterialTheme.colorScheme.surface
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    modifier = Modifier.padding(8.dp),
                    text = title,
                    style = MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.surface
                )
            }
        }
    }
}
@Composable
fun StandardText(label: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .padding(8.dp),
        style = MaterialTheme.typography.displayMedium,
        color = MaterialTheme.colorScheme.surface,
        maxLines = 100,
        text = label
    )
}
@Composable
fun StandardTextDetail(label: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .padding(8.dp),
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.surface,
        maxLines = 100,
        text = label
    )
}
@Composable
fun StandardTextDetailFav(label: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .padding(8.dp),
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.surface,
        maxLines = 100,
        text = label
    )
}


@Composable
fun StandardButton(label: String, modifier: Modifier = Modifier,onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        modifier = Modifier,

    ) {
        Text(label)
    }
}
@Composable
fun StandardButtonColorRed(label: String, modifier: Modifier = Modifier,onClick: () -> Unit,enabled: Boolean = true) {
    val extendedColorScheme = LocalExtendedColorScheme.current
    Button(
        onClick = { onClick() },
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = extendedColorScheme.colorCustom2.color,
            contentColor = MaterialTheme.colorScheme.surface
        )
        ) {
        Text(label)
    }
}
@Composable
fun BarraDetallesPersonaje(title: String, character: Character,onClick: () -> Unit) {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(character.colorFondo),
        shadowElevation = 1.dp,
        shape = MaterialTheme.shapes.medium,
        color = character.colorFondo
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(50.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Default.ArrowBack,
                modifier = Modifier.size(50.dp).clickable { onClick() },
                contentDescription = stringResource(R.string.opciones),
                tint = MaterialTheme.colorScheme.surface,
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    modifier = Modifier.padding(8.dp),
                    text = title,
                    style = MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.surface
                )
            }
        }
    }
}


