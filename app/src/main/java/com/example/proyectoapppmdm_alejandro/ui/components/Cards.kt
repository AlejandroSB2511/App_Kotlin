package com.example.proyectoapppmdm_alejandro.ui.components

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.compose.LocalExtendedColorScheme
import com.example.proyectoapppmdm_alejandro.R
import com.example.proyectoapppmdm_alejandro.model.Character
import com.example.proyectoapppmdm_alejandro.model.Datasource.characterList


@Composable
fun CharacterCard(character: Character,onClick: () -> Unit) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {
        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = MaterialTheme.colorScheme.primary.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = MaterialTheme.colorScheme.primary.luminance() > 0.5f
        }

    }
    var isFavorite by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .fillMaxSize().clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
    ) {
        Row(
            Modifier.background(character.colorFondo),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = character.name,
                modifier = Modifier
                    .fillMaxHeight()
                    .size(150.dp),
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                StandardText(character.name)

            }
            IconButton(
                onClick = {
                    isFavorite = !isFavorite
                },
            ) {
                if (isFavorite == true) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        modifier = Modifier.size(48.dp),
                        contentDescription = stringResource(R.string.favorito),
                        tint = MaterialTheme.colorScheme.surface
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        modifier = Modifier.size(48.dp),
                        contentDescription = stringResource(R.string.favorito),
                        tint = MaterialTheme.colorScheme.surface
                    )
                }
            }
        }

    }
}
@Composable
fun FavCharacterCard(character: Character,onClick: () -> Unit,onClickClear: () -> Unit) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {
        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = MaterialTheme.colorScheme.primary.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = MaterialTheme.colorScheme.primary.luminance() > 0.5f
        }
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .fillMaxSize().clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
    ) {
        Row(
            Modifier.background(character.colorFondo),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = character.name,
                modifier = Modifier
                    .fillMaxHeight()
                    .size(150.dp),
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                StandardText(character.name)
            }
            IconButton(
                onClick = { onClickClear()},
                modifier = Modifier.size(48.dp)
            ) { Icon(
                imageVector = Icons.Default.Delete,
                modifier = Modifier.size(48.dp),
                contentDescription = stringResource(R.string.icono_eliminar),
                tint = MaterialTheme.colorScheme.onSecondaryContainer
            )
            }


        }
    }
}
@Composable
fun CharacterCardLand(character: Character,onClick: () -> Unit) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {
        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = MaterialTheme.colorScheme.primary.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = MaterialTheme.colorScheme.primary.luminance() > 0.5f
        }
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp).clickable { onClick() },
        shape = MaterialTheme.shapes.medium,
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(character.colorFondo),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = character.name,
                modifier = Modifier
                    .fillMaxHeight()
                    .size(150.dp),
            )
            StandardText(character.name, Modifier.weight(0.5f))
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                StandardText(stringResource(R.string.movieP,character.shortFilms))
            }
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                modifier = Modifier.size(48.dp),
                contentDescription = stringResource(R.string.favorito),
                tint = MaterialTheme.colorScheme.surface
            )
        }
    }
}
@Composable
fun FavCharacterCardLand(character: Character,onClick: () -> Unit) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {
        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = MaterialTheme.colorScheme.primary.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = MaterialTheme.colorScheme.primary.luminance() > 0.5f
        }
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp).clickable { onClick },
        shape = MaterialTheme.shapes.medium,
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(character.colorFondo),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = character.name,
                modifier = Modifier
                    .fillMaxHeight()
                    .size(150.dp),
            )
            StandardText(character.name, Modifier.weight(0.5f))
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                StandardText(stringResource(R.string.movieP,character.shortFilms))
            }
            Icon(
                imageVector = Icons.Default.Delete,
                modifier = Modifier.size(48.dp),
                contentDescription = stringResource(R.string.icono_eliminar),
                tint = MaterialTheme.colorScheme.onSecondaryContainer
            )
        }
    }
}
@Composable
fun CharacterDetailCard(
    character: Character,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {

        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = character.colorFondo.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = character.colorFondo.luminance() > 0.5f
        }
    }
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
    ) {
        BarraDetallesPersonaje(stringResource(R.string.detalles_personaje),character,onBackClick)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(character.colorFondo)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = stringResource(R.string.imagen_jessie),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            StandardText(stringResource(R.string.nombreDetail,character.name))

            Spacer(modifier = Modifier.height(8.dp))

           StandardTextDetail(stringResource(R.string.videogameDetail,character.videogames))
           StandardTextDetail(stringResource(R.string.showDetail,character.tvShows))
            StandardTextDetail(stringResource(R.string.movieDetail,character.shortFilms))
            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = onFavoriteClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
            StandardTextDetail(stringResource(R.string.favorito))
            }
        }
    }
}
@Composable
fun CharacterDetailCardLand(
    character: Character,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {
        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = character.colorFondo.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = character.colorFondo.luminance() > 0.5f
        }
    }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
    ) {
        BarraDetallesPersonaje(stringResource(R.string.detalles_personaje),character,onBackClick)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(character.colorFondo)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = stringResource(R.string.imagen_jessie),
                modifier = Modifier
                    .width(500.dp)
                    .height(500.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                StandardText(stringResource(R.string.nombreDetail,character.name))
                StandardTextDetail(stringResource(R.string.videogameDetail,character.videogames))
                StandardTextDetail(stringResource(R.string.showDetail,character.tvShows))
                StandardTextDetail(stringResource(R.string.movieDetail,character.shortFilms))

            }

        }
        Button(
            onClick = onFavoriteClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            StandardTextDetail(stringResource(R.string.favorito))
        }
    }
}
@Composable
fun CharacterDetailFavCard(
    character: Character,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val view = LocalView.current
    if (!view.isInEditMode) {

        val activity = context as Activity
        val window = activity.window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = character.colorFondo.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val insetsController = WindowInsetsControllerCompat(window, view)
            insetsController.isAppearanceLightStatusBars = character.colorFondo.luminance() > 0.5f
        }
    }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
    ) {
        BarraDetallesPersonaje(stringResource(R.string.detail_fav), character,onBackClick)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(character.colorFondo)
                .padding(16.dp)
        ) {
            val extendedColorScheme = LocalExtendedColorScheme.current
            Image(
                painter = painterResource(id = character.imageResId),
                contentDescription = stringResource(R.string.imagen_jessie),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            StandardText(stringResource(R.string.nombreDetail, character.name))

            Spacer(modifier = Modifier.height(8.dp))

            StandardTextDetailFav(stringResource(R.string.videogameDetail, character.videogames))
            StandardTextDetailFav(stringResource(R.string.showDetail, character.tvShows))
            StandardTextDetailFav(stringResource(R.string.movieDetail, character.shortFilms))
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                items(10) { index ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 2.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
                    ) {
                        StandardTextDetailFav(stringResource(R.string.comment,index))
                    }

                }
            }
            FloatingActionButton(
                onClick = { /* Acción del FAB */ },
                modifier = Modifier
                    .padding(8.dp).align(Alignment.End),
                containerColor = MaterialTheme.colorScheme.primary
            ) {

                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = stringResource(R.string.add_comment),
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
}
