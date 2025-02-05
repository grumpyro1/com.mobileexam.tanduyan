package com.example.commobileexamtanduyan.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.commobileexamtanduyan.data.Character
import com.example.commobileexamtanduyan.data.characters

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(){

    Scaffold(
        topBar ={
            CenterAlignedTopAppBar(
                title = { Text("Rick and Morty")}
            )
        }
    ) { it ->
        LazyColumn (contentPadding = it){
            items(characters){
                CharacterItem(
                    character = it,
                )
            }
        }
    }
}
@Composable
fun CharacterItem(character: Character){
    Card {
        Text(text = stringResource(id = character.name)) // Character name
        Text(text = stringResource(id = character.status)) // Character status
        Text(text = stringResource(id = character.species)) // Character species
        Text(text = stringResource(id = character.gender)) // Character gender
    }
}
