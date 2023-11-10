package com.example.build_superheroes_app

import android.content.res.Configuration
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.build_superheroes_app.Model.HeroesRepository
import com.example.build_superheroes_app.ui.theme.Build_superheroes_appTheme


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HeroesList(heroes: Any) {

}

@Composable
fun HeroListItem(hero: Hero) {

}

@Preview("Light Theme")
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HeroPreview() {
    val hero = Hero(
        R.string.hero1,
        R.string.description1,
        R.drawable.android_superhero1
    )
    Build_superheroes_appTheme{
        HeroListItem(hero = hero)
    }
}



@Preview("Heroes List")
@Composable
fun HeroesPreview() {
    Build_superheroes_appTheme(darkTheme = false) {
        Surface (
            color = MaterialTheme.colorScheme.background
        ) {
            HeroesList(heroes = HeroesRepository.heroes)
        }
    }
}
