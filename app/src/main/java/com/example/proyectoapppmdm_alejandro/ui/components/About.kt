package com.example.proyectoapppmdm_alejandro.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ProyectoAppPMDM_AlejandroTheme


@Composable
fun AboutMeDisplay(
    name: String,
    tematica: String,
    descripcion: String,
    version: String,
    modifier: Modifier = Modifier,
    enviarCorreo: () -> Unit

) {
    Column(
        modifier = Modifier
            .fillMaxSize().background(color = MaterialTheme.colorScheme.primary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        StandardText(name)
        StandardText(tematica)
        StandardText(descripcion)
        StandardText(version)
        Icon(
            Icons.Rounded.Email,
            contentDescription = null,
            Modifier.clickable { enviarCorreo() }
        )
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoAppPMDM_AlejandroTheme() {
        Greeting("Android")
    }
}

