package com.example.commobileexamtanduyan.ui.screens
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.commobileexamtanduyan.R
import Character
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.height
import androidx.navigation.NavController

@Composable
fun CharacterScreen(
    characters: List<Character>,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier) {
        items(items = characters, key = { character -> character.id }) { character ->
            CharacterCard(character = character, navController = navController) // Pass the navController to each CharacterCard
        }
    }
}
@Composable
fun CharacterCard(
    character: Character,
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    var isClick by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {navController.navigate("DetailsScreen/${character.id}")},
        shape = MaterialTheme.shapes.medium,
    ) {
        CharacterInfo(character)

        Column(
            modifier = Modifier.animateContentSize(
                animationSpec = tween(durationMillis = 500,easing = LinearOutSlowInEasing)
            )
        ) {
            Text(
                text = if(isClick) stringResource(R.string.less_details) else stringResource(R.string.more_details),                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 15.dp, bottom = 15.dp).clickable { isClick = !isClick }
            )
            if(isClick) {MoreDetails(character)}
        }
    }
}

@Composable
fun CharacterInfo (character: Character){
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current).data(character.image).crossfade(true).build(),
            contentDescription = stringResource(R.string.character_photo),
            modifier = Modifier.size(150.dp).padding(end = 16.dp).clip(RoundedCornerShape(20.dp)),
            error = painterResource(R.drawable.ic_broken_image),
            placeholder = painterResource(R.drawable.loading_img),
        )
        Column(
            modifier = Modifier.padding(20.dp),verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(text = character.name, style = MaterialTheme.typography.bodyLarge)
            Text(text = character.status, style = MaterialTheme.typography.bodyMedium)
            Text(text = character.species, style = MaterialTheme.typography.bodyMedium)
            Text(text = character.type, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
@Composable
fun MoreDetails(character: Character) {
    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Name: ${character.name}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Status: ${character.status}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Species: ${character.species}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Type: ${character.type}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Gender: ${character.gender}", style = MaterialTheme.typography.bodyMedium)
    }
}


@Composable
fun CharacterDetails(character: Character) {
    Column(modifier = Modifier.padding(16.dp)) {
        AsyncImage(
            model = character.image,
            contentDescription = stringResource(R.string.character_photo),
            modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth().height(500.dp).padding(all = 30.dp),
            error = painterResource(R.drawable.ic_broken_image),
            placeholder = painterResource(R.drawable.loading_img)
        )
        Text(text = "Name: ${character.name}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Status: ${character.status}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Species: ${character.species}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Type: ${character.type}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Gender: ${character.gender}", style = MaterialTheme.typography.bodyMedium)
    }
}