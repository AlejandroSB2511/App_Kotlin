package com.example.proyectoapppmdm_alejandro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoapppmdm_alejandro.model.Character
import com.example.proyectoapppmdm_alejandro.model.Datasource.getCharacterByName
import com.example.proyectoapppmdm_alejandro.ui.components.CharacterDetailCard
import com.example.proyectoapppmdm_alejandro.ui.components.CharacterDetailCardLand

@Composable
fun DetailCharacterScreen(name: String, navController: NavController,modifier: Modifier = Modifier) {
    val character = getCharacterByName(name)
    if (character != null) {
        Column(
            modifier = Modifier
                .fillMaxSize().background(character.colorFondo)

        ) {
            val character = getCharacterByName(name)
            if (character != null) {
                CharacterDetailCard(
                    character = character,
                    onFavoriteClick = {
                    },
                    onBackClick = { navController.navigateUp() }
                )
            }
        }
    }
}
@Composable
fun DetailCharacterScreenMedium(name: String, navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        val character = getCharacterByName(name)
        if (character != null) {
            CharacterDetailCardLand(
                character = character,
                onFavoriteClick = {
                },
                onBackClick = { navController.navigateUp() }
            )
        }
    }
}