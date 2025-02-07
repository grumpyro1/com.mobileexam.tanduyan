package com.example.commobileexamtanduyan.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.commobileexamtanduyan.data.Character
import com.example.commobileexamtanduyan.data.characters

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun AppScreen(){

    Scaffold(
        topBar ={
            CenterAlignedTopAppBar(title = { Text("Rick and Morty")})
        }
    ) { it ->
        LazyColumn (contentPadding = it){
            items(characters){CharacterItem(character = it)}
        }
    }
}
@Composable
fun CharacterItem(character: Character, modifier: Modifier = Modifier){
    var isClick by remember { mutableStateOf(false) }
    Card (modifier = modifier .padding(horizontal = 25.dp, vertical = 10.dp,).animateContentSize(
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioNoBouncy,
            stiffness = Spring.StiffnessMedium
        )
    )){
       Column (modifier = Modifier.fillMaxWidth().padding(10.dp), verticalArrangement = Arrangement.spacedBy(8.dp)){
           CharacterInfo(character)
           Text(
               text = stringResource(R.string.more_details),
               style = MaterialTheme.typography.bodySmall,
               modifier = Modifier
                   .padding(start = 15.dp, bottom = 5.dp)
                   .clickable { isClick = !isClick }
           )

           if (isClick) {
               MoreDetails(character)
           }
       }
    }
}
@Composable
fun CharacterInfo (character: Character){
    Row {
        Image(
            painter = painterResource(id = character.image),
            contentDescription = stringResource(id = character.name),
            modifier = Modifier
                .size(150.dp)
                .align(Alignment.CenterVertically)
                .padding(16.dp),
        )
        Column (modifier = Modifier.padding(20.dp),verticalArrangement = Arrangement.spacedBy(4.dp)){
            Text(text = stringResource(id = character.name),style =  MaterialTheme.typography.bodyLarge)
            Text(text = stringResource(id = character.status),style =  MaterialTheme.typography.bodyMedium)
            Text(text = stringResource(id = character.species),style =  MaterialTheme.typography.bodyMedium)
            Text(text = stringResource(id = character.type),style =  MaterialTheme.typography.bodyMedium)
        }
    }
}
@Composable
fun MoreDetails(character: Character){

    Column (modifier = Modifier.padding(20.dp)){
        Text(text = stringResource(id = character.gender),style =  MaterialTheme.typography.bodyMedium)
        Text(text = stringResource(id = character.origin.name),style =  MaterialTheme.typography.bodyMedium)
        Text(text = stringResource(id = character.location.name),style =  MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppScreen() {
    AppScreen()
}