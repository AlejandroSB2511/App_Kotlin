package com.example.proyectoapppmdm_alejandro.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.proyectoapppmdm_alejandro.R
import com.example.proyectoapppmdm_alejandro.ui.components.AboutMeDisplay

@Composable
fun AboutScreenApp(
    onEmailClick: () -> Unit
) {
    val aboutMeTitle = stringResource(R.string.titleAppBar)
    var name = stringResource(R.string.nameAbout)
    var tematica = stringResource(R.string.tematicaAbout)
    var descripcion = stringResource(R.string.descAbout)
    var version = stringResource(R.string.versionAbout)
    AboutMeDisplay(name,tematica,descripcion,version, modifier = Modifier,onEmailClick)
}