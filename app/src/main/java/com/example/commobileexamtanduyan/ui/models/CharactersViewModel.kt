package com.example.commobileexamtanduyan.ui.models

import CharacterResponse
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.commobileexamtanduyan.RickAndMortyApplication
import com.example.commobileexamtanduyan.data.repository.CharactersRepository
import com.example.commobileexamtanduyan.data.repository.NetworkCharactersRepository
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface CharactersUiState {
    data class Success(val characters: CharacterResponse) : CharactersUiState
    object Error : CharactersUiState
    object Loading : CharactersUiState
}
class CharactersViewModel(
    private val charactersRepository: CharactersRepository
) : ViewModel() {
    /** The mutable State that stores the status of the most recent request */
    var charactersUiState: CharactersUiState by mutableStateOf(CharactersUiState.Loading)
        private set

    init {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            try {
                charactersUiState = CharactersUiState.Success(
                    charactersRepository.getCharacters()
                )
            } catch (e: IOException) {
                // Update the charactersUiState with the error state
                charactersUiState = CharactersUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as RickAndMortyApplication)
                val charactersRepository = application.container.charactersRepository
                CharactersViewModel(charactersRepository = charactersRepository)
            }
        }
    }


}