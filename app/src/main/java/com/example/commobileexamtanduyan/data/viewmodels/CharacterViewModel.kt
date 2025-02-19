package com.example.commobileexamtanduyan.data.viewmodels

import androidx.lifecycle.ViewModel
import com.example.commobileexamtanduyan.data.dataclass.Character
import com.example.commobileexamtanduyan.data.dataclass.LocalCharacterDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class CharacterUiState(
    val characterList: List<Character> = emptyList(),
    val currentCharacter: Character = LocalCharacterDataProvider.defaultCharacter,
    val isShowingListPage: Boolean = true
)



class CharacterViewModel : ViewModel() {  // Manages Data for the UI

    private val _uiState = MutableStateFlow(
        CharacterUiState(
            characterList = LocalCharacterDataProvider.getCharacterData(),
            currentCharacter = LocalCharacterDataProvider.getCharacterData().getOrElse(0) {
                LocalCharacterDataProvider.defaultCharacter
            }
        )
    )
    val uiState: StateFlow<CharacterUiState> = _uiState

    fun updateCurrentCharacter(selectedCharacter: Character) {
        _uiState.update {
            it.copy(currentCharacter = selectedCharacter)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }


    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}