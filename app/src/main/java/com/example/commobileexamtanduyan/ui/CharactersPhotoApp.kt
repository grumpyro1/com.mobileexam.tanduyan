package com.example.commobileexamtanduyan.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.commobileexamtanduyan.R
import com.example.commobileexamtanduyan.ui.models.CharactersUiState
import com.example.commobileexamtanduyan.ui.models.CharactersViewModel
import com.example.commobileexamtanduyan.ui.screens.CharacterDetails
import com.example.commobileexamtanduyan.ui.screens.MainScreen

@Composable
fun CharactersPhotoApp() {
    val charactersViewModel: CharactersViewModel = viewModel(factory = CharactersViewModel.Factory)
    val characterViewModel: CharactersViewModel = viewModel()
    val navController: NavHostController = rememberNavController()
    var currentTitle by remember { mutableStateOf("Rick and Morty") } // Default title

    Scaffold(
        topBar = {
            RickAndMortyAppBar(
                title = currentTitle,
                showBackButton = navController.currentBackStackEntry?.destination?.route != "mainScreen",
                onBackPressed = {navController.popBackStack()}
            )
        }
    ) { innerPadding ->
            NavHost(navController = navController,startDestination = "mainScreen",modifier = Modifier.padding(innerPadding)) {

                composable("mainScreen") {
                    currentTitle = "Rick And Morty"
                    MainScreen(
                        characterUiState = characterViewModel.charactersUiState,
                        navController = navController,
                        contentPadding = innerPadding,
                    )
                }
                composable("DetailsScreen/{characterId}") { backStackEntry ->
                    val characterId = backStackEntry.arguments?.getString("characterId")?.toInt()
                    val character = charactersViewModel.charactersUiState.let { state ->
                        if (state is CharactersUiState.Success) {
                            state.characters.results.find { it.id == characterId }
                        } else null
                    }

                    character?.let {
                        currentTitle = it.name
                        CharacterDetails(character = it)
                    }
                }
            }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RickAndMortyAppBar(
    title: String,
    showBackButton: Boolean,
    onBackPressed: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = onBackPressed) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                }
            }
        }
    )
}

