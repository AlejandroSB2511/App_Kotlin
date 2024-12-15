package com.example.proyectoapppmdm_alejandro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.proyectoapppmdm_alejandro.R
import com.example.proyectoapppmdm_alejandro.model.Character
import com.example.proyectoapppmdm_alejandro.ui.components.CharacterCard
import com.example.proyectoapppmdm_alejandro.ui.components.CharacterCardLand
import com.example.proyectoapppmdm_alejandro.ui.components.MedHeaderComp

@Composable
fun CharacterListScreenCompact(Characters: MutableList<Character>, navController: NavController,modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        MedHeaderComp(title = stringResource(id = R.string.list_Games))
        LazyColumn(modifier = Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.primary)) {
            items(Characters) { character ->
                CharacterCard(character) {
                    navController.navigate("character_detail/${character.name}")
                }
            }
        }
    }
}
@Composable
fun CharacterListScreenMed(Characters: MutableList<Character>,navController: NavController,modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        MedHeaderComp(title = stringResource(id = R.string.list_Games_med))
        LazyColumn(modifier = Modifier.background(MaterialTheme.colorScheme.primary)) {
            items(Characters) { character ->
                CharacterCardLand(character) {
                    navController.navigate("character_detail/${character.name}")
                }
            }
        }
    }
}