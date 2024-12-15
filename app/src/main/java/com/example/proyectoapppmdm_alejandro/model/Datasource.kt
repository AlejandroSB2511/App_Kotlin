package com.example.proyectoapppmdm_alejandro.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.proyectoapppmdm_alejandro.R


object Datasource {

    val characterList: () -> MutableList<Character> = {
        mutableListOf<Character>(
            Character(
                name = "Angel",
                videogames = "Kingdom Hearts: Chain of Memories (2004),Kingdom Hearts II (2005), Disney Infinity (2013-2016)",
                tvShows = "Lilo & Stitch: The Series (2003-2006),Stitch! (2008-2011)",
                shortFilms = "Lilo & Stitch 2: Stitch Has a Glitch (2005)",
                imageResId = R.drawable.angel,
                colorFondo = Color(0xFF8BC34A)
            ),
            Character(
                name = "Aladdin",
                videogames = "Aladdin (1993),Kingdom Hearts (2002),Kingdom Hearts II (2005)",
                tvShows = "Aladdin: The Animated Series(1994-1995),House of Mouse(2001-2003) ",
                shortFilms = "Aladdin(1992)",
                imageResId = R.drawable.aladin,
                colorFondo = Color(0xFF6EC6E9)
            ),
            Character(
                name = "Ariel",
                videogames = "Kingdom Hearts (2002),Kingdom Hearts II (2005)",
                tvShows = "The Little Mermaid: The Animated Series (1992-1994),The Wonderful World of Disney",
                shortFilms = "The Little Mermaid (1989), The Little Mermaid 2: Return to the Sea (2000),The Little Mermaid: Ariel's Beginning (2008) ",
                imageResId = R.drawable.ariel,
                colorFondo = Color(0xFF00B2A9)
            ),
            Character(
                name = "Bella",
                videogames = "Kingdom Hearts (2002),Disney Infinity (2013-2016)",
                tvShows = "Beauty and the Beast: The Animated Series (1991-1992)",
                shortFilms = "Beauty and the Beast (1991), Beauty and the Beast: The Enchanted Christmas (1997)",
                imageResId = R.drawable.bella,
                colorFondo = Color(0xFFFFEB3B)
            ),
            Character(
                name = "Snow White",
                videogames = "Kingdom Hearts (2002),Disney Infinity (2013-2016)",
                tvShows = "Once Upon a Time (2011-2018)",
                shortFilms = "Snow White and the Seven Dwarfs (1937)",
                imageResId = R.drawable.blancanieves,
                colorFondo = Color(0xFF2196F3)
            ),
            Character(
                name = "Chip",
                videogames = "Disney Infinity (2013-2016)",
                tvShows = "",
                shortFilms = "Beauty and the Beast (1991) ",
                imageResId = R.drawable.chip,
                colorFondo = Color(0xFFFFD700)
            ),
            Character(
                name = "Chip & Dale",
                videogames = "Disney Infinity (2013-2016)",
                tvShows = "Chip 'n Dale: Rescue Rangers (1989-1990), Chip 'n Dale: Park Life (2021)",
                shortFilms = "Chip 'n Dale: Rescue Rangers (2022),The Rescuers (1990) ",
                imageResId = R.drawable.chipchop,
                colorFondo = Color(0xFFFFCDD2)
            ),
            Character(
                name = "Donald",
                videogames = "Kingdom Hearts (2002), Disney Infinity (2013-2016)",
                tvShows = "DuckTales (1987-1990, 2017-2021), The Three Caballeros (1944)",
                shortFilms = "The Wise Little Hen (1934)",
                imageResId = R.drawable.donald,
                colorFondo = Color(0xFFE57373)
            ),
            Character(
                name = "Elsa",
                videogames = "Kingdom Hearts III (2019),Disney Infinity (2013-2016) ",
                tvShows = "Frozen: The Animated Series (2015)",
                shortFilms = "Frozen (2013), Frozen II (2019)",
                imageResId = R.drawable.elsa,
                colorFondo = Color(0xFF2196F3)
            ),
            Character(
                name = "Forky",
                videogames = "Disney Infinity (2013-2016)",
                tvShows = "Forky Asks a Question (2019)",
                shortFilms = "Toy Story 4 (2019)",
                imageResId = R.drawable.forky,
                colorFondo = Color(0xFF2196F3)
            ),
            Character(
                name = "Jessie",
                videogames = "Kingdom Hearts III (2019), Disney Infinity (2013-2016)",
                tvShows = "Toy Story of Terror! (2013), Toy Story That Time Forgot (2014)",
                shortFilms = "Toy Story 2 (1999), Toy Story 3 (2010), Toy Story 4 (2019)",
                imageResId = R.drawable.jessie,
                colorFondo = Color(0xFF9C27B0)
            ),
            Character(
                name = "Brave",
                videogames = "",
                tvShows = "",
                shortFilms = "Brave (2012)",
                imageResId = R.drawable.merida,
                colorFondo = Color(0xFFFFA500)
            ),
            Character(
                name = "Mickey",
                videogames = "Kingdom Hearts (2002),Disney Infinity (2013-2016), Mickey's Once Upon a Christmas (1999)",
                tvShows = "Mickey Mouse Clubhouse (2006-2016), Mickey Mouse Funhouse (2021-present)",
                shortFilms = "Steamboat Willie (1928), Fantasia (1940),Mickey, Donald, Goofy: The Three Musketeers (2004)",
                imageResId = R.drawable.mickey,
                colorFondo = Color(0xFFE57373)
            ),
            Character(
                name = "Mulan",
                videogames = "Kingdom Hearts II (2005), Disney Infinity (2013-2016)",
                tvShows = "Mulan: The Animated Series (1998-1999)",
                shortFilms = "Mulan (1998), Mulan II (2004),Mulan (2020) ",
                imageResId = R.drawable.mulan,
                colorFondo = Color(0xFF8BC34A)
            ),
            Character(
                name = "Olaf",
                videogames = "Kingdom Hearts III (2019), Disney Infinity (2013-2016)",
                tvShows = "Olaf's Frozen Adventure (2017)",
                shortFilms = "Frozen (2013), Frozen II (2019), Olaf's Frozen Adventure (2017)",
                imageResId = R.drawable.olaf,
                colorFondo = Color(0xFF6EC6E9)
            ),
            Character(
                name = "Pocahontas",
                videogames = "Kingdom Hearts (2002), Disney Infinity (2013-2016)",
                tvShows = "Pocahontas: The Animated Series (1997-1998)",
                shortFilms = "Pocahontas (1995), Pocahontas II: Journey to a New World (1998)",
                imageResId = R.drawable.pocahontas,
                colorFondo = Color(0xFF6EC6E9)
            ),
            Character(
                name = "Stitch",
                videogames = "Kingdom Hearts (2002), Disney Infinity (2013-2016)",
                tvShows = "Lilo & Stitch: The Series (2003-2006), Stitch! (2008-2011)",
                shortFilms = "Lilo & Stitch (2002), Lilo & Stitch 2: Stitch Has a Glitch (2005), Leroy & Stitch (2006)",
                imageResId = R.drawable.stitch,
                colorFondo = Color(0xFF00C853)
            ),
            Character(
                name = "Sullivan",
                videogames = "Kingdom Hearts II (2005), Disney Infinity (2013-2016)",
                tvShows = "Monsters at Work (2021-present)",
                shortFilms = "Monsters, Inc (2001), Monsters University (2013)",
                imageResId = R.drawable.sullivan,
                colorFondo = Color(0xFF9C27B0)
            ),
            Character(
                name = "Wall-E",
                videogames = "",
                tvShows = "",
                shortFilms = "WALL-E (2008)",
                imageResId = R.drawable.walle,
                colorFondo = Color(0xFFF4A460)
            ),
            Character(
                name = "Woody",
                videogames = "Kingdom Hearts III (2019), Disney Infinity (2013-2016)",
                tvShows = "Toy Story of Terror! (2013), Toy Story That Time Forgot (2014)",
                shortFilms = "Toy Story (1995), Toy Story 2 (1999), Toy Story 3 (2010), Toy Story 4 (2019)",
                imageResId = R.drawable.woody,
                colorFondo = Color(0xFF9C27B0)
            ),


        )
    }

    val favList: () -> MutableList<Character> = {
        mutableListOf<Character>(
            Character(
                name = "Aladdin",
                videogames = "Aladdin (1993),Kingdom Hearts (2002),Kingdom Hearts II (2005)",
                tvShows = "Aladdin: The Animated Series(1994-1995),House of Mouse(2001-2003) ",
                shortFilms = "Aladdin (1992)",
                imageResId = R.drawable.aladin,
                colorFondo = Color(0xFF6EC6E9)
            ),
            Character(
                name = "Woody",
                videogames = "",
                tvShows = "",
                shortFilms = "Toy Story (1995)",
                imageResId = R.drawable.woody,
                colorFondo = Color(0xFF9C27B0)
            ),
            Character(
                name = "Stitch",
                videogames = "",
                tvShows = "Fillmore!",
                shortFilms = "Lilo & Stitch (2002)",
                imageResId = R.drawable.stitch,
                colorFondo = Color(0xFF00C853)
            ),
            Character(
                name = "Mulan",
                videogames = "",
                tvShows = "",
                shortFilms = "Mulan (1998)",
                imageResId = R.drawable.mulan,
                colorFondo = Color(0xFF8BC34A)
            ),
            Character(
                name = "Jessie",
                videogames = "",
                tvShows = "",
                shortFilms = "Toy Story 2 (1999)",
                imageResId = R.drawable.jessie,
                colorFondo = Color(0xFF9C27B0)
            ),
        )
    }


    val getCharacterByName: (String) -> Character? = { name ->
        characterList().find { it.name == name } ?: null
    }


    val getSomeRandCharacters: @Composable (Int) -> MutableList<Character> = { num ->
        val characters = characterList()
        if (num <= characters.size) characters.subList(0, num)
        characters
    }
}