package com.example.commobileexamtanduyan.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.commobileexamtanduyan.R
import com.example.commobileexamtanduyan.data.dataclass.Character
import com.example.commobileexamtanduyan.data.viewmodels.CharacterViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.commobileexamtanduyan.screens.CharacterDetails
import com.example.commobileexamtanduyan.screens.CharacterList

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun AppScreen(){
    val viewModel: CharacterViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar ={CenterAlignedTopAppBar(title = { Text("Rick and Morty")})}
    ) { innerPadding ->
        if(uiState.isShowingListPage) {
            CharacterList(
                characters = uiState.characterList,
                contentPadding = innerPadding,
                onClick = {
                    viewModel.updateCurrentCharacter(it)
                    viewModel.navigateToDetailPage()
                }
            )
        }else{
            CharacterDetails(
                selectedCharacter = uiState.currentCharacter,
                contentPadding = innerPadding,
                onBackPressed = {
                    viewModel.navigateToListPage()
                }
            )
        }

        }
    }

@Preview(showBackground = true)
@Composable
fun PreviewAppScreen() {
    AppScreen()
}