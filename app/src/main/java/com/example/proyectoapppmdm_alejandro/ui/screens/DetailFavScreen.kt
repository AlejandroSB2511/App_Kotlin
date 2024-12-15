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
import com.example.proyectoapppmdm_alejandro.ui.components.CharacterDetailFavCard



@Composable
fun DetailFavCharacterScreen(name: String,character: Character, navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
           .background(character.colorFondo)
    ) {
        CharacterDetailFavCard(
            character = character,
            onFavoriteClick = {
            },
            onBackClick = { navController.navigateUp() }
        )
    }
}