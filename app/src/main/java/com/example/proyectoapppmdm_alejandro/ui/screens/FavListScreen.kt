package com.example.proyectoapppmdm_alejandro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.proyectoapppmdm_alejandro.R
import com.example.proyectoapppmdm_alejandro.model.Character
import com.example.proyectoapppmdm_alejandro.ui.components.DeleteDialog
import com.example.proyectoapppmdm_alejandro.ui.components.FavCharacterCard
import com.example.proyectoapppmdm_alejandro.ui.components.FavCharacterCardLand
import com.example.proyectoapppmdm_alejandro.ui.components.MedHeaderComp

@Composable
fun FavCharacterListScreen(characters: MutableList<Character>, navController: NavController, modifier: Modifier = Modifier) {
    var showDialog by remember { mutableStateOf(false) }
    var characterNameSelected by remember { mutableStateOf("") }
    if(showDialog) {
        DeleteDialog(
            name = characterNameSelected,
            onCancel = { showDialog = false },
            onConfirm = {
                characters.removeIf { it.name == characterNameSelected }
                showDialog = false
            }
        )
    }
    Column(modifier = modifier.fillMaxSize()) {
        MedHeaderComp(title = stringResource(id = R.string.fav_characters))
        LazyColumn(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primary)) {
            items(characters) { character ->
                FavCharacterCard(
                    character,
                    onClick = {navController.navigate("characterfav_detail/${character.name}")}
                ) {

                    characterNameSelected = character.name
                    showDialog = true
                }
            }
        }
    }
}
@Composable
fun FavCharacterListScreenLand(Characters: MutableList<Character>, navController: NavController,modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        MedHeaderComp(title = stringResource(id = R.string.fav_characters))
        LazyColumn(modifier = Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.primary)) {
            items(Characters) { character ->
                FavCharacterCardLand(character) {
                    navController.navigate("characterfav_detail/${character.name}")
                }
            }
        }
    }
}