package com.example.proyectoapppmdm_alejandro.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.proyectoapppmdm_alejandro.R

@Composable
fun BottomNavigationBar(navController: NavController, currentRoute: String?) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.onTertiary
    ) {
        val items = listOf(
            BottomNavItem("character_list", Icons.AutoMirrored.Filled.List, stringResource(R.string.characters)),
            BottomNavItem("favorite_list", Icons.Default.Favorite, stringResource(R.string.favorite)),
            BottomNavItem("profile", Icons.Default.Person, stringResource(R.string.profile)) ,
            BottomNavItem("about", Icons.Default.Person, stringResource(R.string.about))
        )

        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }

                },
                colors = NavigationBarItemDefaults.colors(
                   selectedIconColor = MaterialTheme.colorScheme.onSurface,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurface,
                    selectedTextColor = MaterialTheme.colorScheme.onSurface,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurface
                )


            )
        }
    }
}
data class BottomNavItem(val route: String, val icon: ImageVector, val label: String)