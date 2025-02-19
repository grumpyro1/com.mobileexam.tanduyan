package com.example.commobileexamtanduyan.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.commobileexamtanduyan.data.dataclass.Character

@Composable
fun CharacterDetails(
    selectedCharacter: Character,
    onBackPressed: () -> Unit,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier
) {
    BackHandler {
        onBackPressed()
    }
    Box {
        Column {
            Image(
                painter = painterResource(selectedCharacter.image),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(500.dp)
                    .padding(all = 30.dp),
                contentScale = ContentScale.Fit
            )
            Text(text = stringResource(selectedCharacter.name))
        }
    }
}