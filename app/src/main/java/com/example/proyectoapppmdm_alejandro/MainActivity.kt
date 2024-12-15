package com.example.proyectoapppmdm_alejandro

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.ProyectoAppPMDM_AlejandroTheme
import com.example.proyectoapppmdm_alejandro.model.Datasource
import com.example.proyectoapppmdm_alejandro.model.Datasource.characterList
import com.example.proyectoapppmdm_alejandro.model.Datasource.favList
import com.example.proyectoapppmdm_alejandro.model.Datasource.getCharacterByName
import com.example.proyectoapppmdm_alejandro.ui.components.AboutMeDisplay
import com.example.proyectoapppmdm_alejandro.ui.components.BottomNavigationBar
import com.example.proyectoapppmdm_alejandro.ui.screens.AboutScreenApp
import com.example.proyectoapppmdm_alejandro.ui.screens.CharacterListScreenCompact
import com.example.proyectoapppmdm_alejandro.ui.screens.CharacterListScreenMed
import com.example.proyectoapppmdm_alejandro.ui.screens.DetailCharacterScreen
import com.example.proyectoapppmdm_alejandro.ui.screens.DetailCharacterScreenMedium
import com.example.proyectoapppmdm_alejandro.ui.screens.DetailFavCharacterScreen
import com.example.proyectoapppmdm_alejandro.ui.screens.FavCharacterListScreen
import com.example.proyectoapppmdm_alejandro.ui.screens.FavCharacterListScreenLand
import com.example.proyectoapppmdm_alejandro.ui.screens.ProfileScreenAppCompact
import com.example.proyectoapppmdm_alejandro.ui.utils.getWindowSizeClass
import kotlinx.coroutines.flow.map


class MainActivity : ComponentActivity() {
    val enviarCorreo: () -> Unit = {
        val intent = Intent(Intent.ACTION_SEND)
            .apply {
                putExtra(Intent.EXTRA_SUBJECT, "Información sobre la Aplicación")
                putExtra(Intent.EXTRA_TEXT, "La Aplicación DisneyInfo es una aplicacion para consultar todos los detalles de el mundo de Disney. Actualmente está en la version 1.0.0")
                type = "text/plain"

            }
        startActivity(intent)
    }
    @RequiresApi(Build.VERSION_CODES.S)
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoAppPMDM_AlejandroTheme {
               DisneyCharacterList(enviarCorreo)
            }
        }
    }
}

//Funcion para la lista entera de juegos
@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun DisneyCharacterList(enviarCorreo: () -> Unit) {

    val navController = rememberNavController()
    val characters = remember { characterList }
    val favCharacters = remember { favList }
    val windowSize = getWindowSizeClass(LocalContext.current as Activity)
    val currentRoute by navController.currentBackStackEntryFlow
        .map { it.destination.route }
        .collectAsState(initial = null)
    ProyectoAppPMDM_AlejandroTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = {
                BottomNavigationBar(navController, currentRoute)
            },
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = "character_list",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("character_list") {
                    when (windowSize) {
                        WindowWidthSizeClass.Compact -> {
                            CharacterListScreenCompact(characters(), navController) }
                        else -> {
                            CharacterListScreenMed(characters(), navController) }
                    }
                }
                composable("favorite_list") {
                    when (windowSize) {
                        WindowWidthSizeClass.Compact -> {
                            FavCharacterListScreen(favCharacters(), navController) }
                        else -> {
                            FavCharacterListScreenLand(favCharacters(), navController) }
                    }
                }
                composable("profile") {
                    when (windowSize) {
                        WindowWidthSizeClass.Compact -> {
                            ProfileScreenAppCompact(navController) }
                        else -> {
                            ProfileScreenAppCompact(navController) }
                    }
                }
                composable("about") {
                    when (windowSize) {
                        WindowWidthSizeClass.Compact -> {
                            AboutScreenApp(onEmailClick = enviarCorreo)
                        }
                        else -> {
                            AboutScreenApp(onEmailClick = enviarCorreo) }
                    }
                }

                composable("character_detail/{character_name}") {
                    val characterName = it.arguments?.getString("character_name") ?: "NoName"
                    when (windowSize) {
                        WindowWidthSizeClass.Compact -> {
                            DetailCharacterScreen(characterName, navController, Modifier.padding(8.dp)) }
                        else -> {
                            DetailCharacterScreenMedium(characterName, navController, Modifier.padding(8.dp)) }
                    }
                }
                composable("characterfav_detail/{character_name}") {
                    val characterName = it.arguments?.getString("character_name") ?: "NoName"
                    val character = getCharacterByName(characterName)
                    when (windowSize) {
                        WindowWidthSizeClass.Compact -> {
                            if (character != null) {
                                DetailFavCharacterScreen(characterName,character,navController, Modifier.padding(8.dp))
                            }
                        }
                        else -> {
                            if (character != null) {
                                DetailFavCharacterScreen(characterName, character,navController, Modifier.padding(8.dp))
                            }
                        }
                    }
                }
            }

        }
    }
}





