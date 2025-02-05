package com.example.commobileexamtanduyan.data

import androidx.annotation.StringRes
import com.example.commobileexamtanduyan.R

data class ApiResponse(
    val info: Info,
    val results: List<Character> // characters
)
data class Info(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)
data class Character(
    val id: Int,
    @StringRes val name: Int,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)
data class Origin(
    val name: String,
    val url: String
)

data class Location(
    val name: String,
    val url: String
)
val characters = listOf(
    Character(
        id = 1,
        name = R.string.rick_sanchez,
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "Earth (C-137)", url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = "Citadel of Ricks", url = "https://rickandmortyapi.com/api/location/3"),
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/1"),
        url = "https://rickandmortyapi.com/api/character/1",
        created = "2017-11-04T18:48:46.250Z"
    ),
    Character(
        id = 2,
        name = R.string.morty_smith,
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Citadel of Ricks", url = "https://rickandmortyapi.com/api/location/3"),
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/1"),
        url = "https://rickandmortyapi.com/api/character/2",
        created = "2017-11-04T18:50:21.651Z"
    ),
    Character(
        id = 3,
        name = R.string.summer_smith,
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Female",
        origin = Origin(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/6"),
        url = "https://rickandmortyapi.com/api/character/3",
        created = "2017-11-04T19:09:56.428Z"
    ),
    Character(
        id = 4,
        name = R.string.beth_smith,
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Female",
        origin = Origin(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/6"),
        url = "https://rickandmortyapi.com/api/character/4",
        created = "2017-11-04T19:22:43.665Z"
    ),
    Character(
        id = 5,
        name = R.string.jerry_smith,
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/6"),
        url = "https://rickandmortyapi.com/api/character/5",
        created = "2017-11-04T19:26:56.301Z"
    ),
    Character(
        id = 6,
        name = R.string.abadango_cluster_princess,
        status = "Alive",
        species = "Alien",
        type = "",
        gender = "Female",
        origin = Origin(name = "Abadango", url = "https://rickandmortyapi.com/api/location/2"),
        location = Location(name = "Abadango", url = "https://rickandmortyapi.com/api/location/2"),
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/27"),
        url = "https://rickandmortyapi.com/api/character/6",
        created = "2017-11-04T19:50:28.250Z"
    ),
    Character(
        id = 7,
        name = R.string.abradolf_lincler,
        status = "unknown",
        species = "Human",
        type = "Genetic experiment",
        gender = "Male",
        origin = Origin(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = "Testicle Monster Dimension", url = "https://rickandmortyapi.com/api/location/21"),
        image = "https://rickandmortyapi.com/api/character/avatar/7.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/7",
        created = "2017-11-04T19:59:20.523Z"
    ),
    Character(
        id = 8,
        name = R.string.adjudicator_rick,
        status = "Dead",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Citadel of Ricks", url = "https://rickandmortyapi.com/api/location/3"),
        image = "https://rickandmortyapi.com/api/character/avatar/8.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/28"),
        url = "https://rickandmortyapi.com/api/character/8",
        created = "2017-11-04T20:03:34.737Z"
    ),
    Character(
        id = 9,
        name = R.string.agency_director,
        status = "Dead",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/9.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/24"),
        url = "https://rickandmortyapi.com/api/character/9",
        created = "2017-11-04T20:06:54.976Z"
    ),
    Character(
        id = 10,
        name = R.string.alan_rails,
        status = "Dead",
        species = "Human",
        type = "Superhuman (Ghost trains summoner)",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Worldender's lair", url = "https://rickandmortyapi.com/api/location/4"),
        image = "https://rickandmortyapi.com/api/character/avatar/10.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/25"),
        url = "https://rickandmortyapi.com/api/character/10",
        created = "2017-11-04T20:19:09.017Z"
    ),
    Character(
        id = 11,
        name = R.string.albert_einstein,
        status = "Dead",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "Earth (C-137)", url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/11.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/12"),
        url = "https://rickandmortyapi.com/api/character/11",
        created = "2017-11-04T20:20:20.965Z"
    ),
    Character(
        id = 12,
        name = R.string.alexander,
        status = "Dead",
        species = "Human",
        type = "",
        gender = "Male",
        origin = Origin(name = "Earth (C-137)", url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = "Anatomy Park", url = "https://rickandmortyapi.com/api/location/5"),
        image = "https://rickandmortyapi.com/api/character/avatar/12.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/3"),
        url = "https://rickandmortyapi.com/api/character/12",
        created = "2017-11-04T20:32:33.144Z"
    ),
    Character(
        id = 13,
        name = R.string.alien_googah,
        status = "unknown",
        species = "Alien",
        type = "",
        gender = "unknown",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/13.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/31"),
        url = "https://rickandmortyapi.com/api/character/13",
        created = "2017-11-04T20:33:30.779Z"
    ),
    Character(
        id = 14,
        name = R.string.alien_morty,
        status = "unknown",
        species = "Alien",
        type = "",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Citadel of Ricks", url = "https://rickandmortyapi.com/api/location/3"),
        image = "https://rickandmortyapi.com/api/character/avatar/14.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/14",
        created = "2017-11-04T20:51:31.373Z"
    ),
    Character(
        id = 15,
        name = R.string.alien_rick,
        status = "unknown",
        species = "Alien",
        type = "",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Citadel of Ricks", url = "https://rickandmortyapi.com/api/location/3"),
        image = "https://rickandmortyapi.com/api/character/avatar/15.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/15",
        created = "2017-11-04T20:56:13.215Z"
    ),
    Character(
        id = 16,
        name = R.string.amish_cyborg,
        status = "Dead",
        species = "Alien",
        type = "Parasite",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Earth (Replacement Dimension)", url = "https://rickandmortyapi.com/api/location/20"),
        image = "https://rickandmortyapi.com/api/character/avatar/16.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/15"),
        url = "https://rickandmortyapi.com/api/character/16",
        created = "2017-11-04T21:12:45.235Z"
    ),
    Character(
        id = 17,
        name = R.string.annie,
        status = "Alive",
        species = "Human",
        type = "",
        gender = "Female",
        origin = Origin(name = "Earth (C-137)", url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = "Anatomy Park", url = "https://rickandmortyapi.com/api/location/5"),
        image = "https://rickandmortyapi.com/api/character/avatar/17.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/3"),
        url = "https://rickandmortyapi.com/api/character/17",
        created = "2017-11-04T22:21:24.481Z"
    ),
    Character(
        id = 18,
        name = R.string.antenna_morty,
        status = "Alive",
        species = "Human",
        type = "Human with antennae",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Citadel of Ricks", url = "https://rickandmortyapi.com/api/location/3"),
        image = "https://rickandmortyapi.com/api/character/avatar/18.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/18",
        created = "2017-11-04T22:25:29.008Z"
    ),
    Character(
        id = 19,
        name = R.string.antenna_rick,
        status = "unknown",
        species = "Human",
        type = "Human with antennae",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "unknown", url = ""),
        image = "https://rickandmortyapi.com/api/character/avatar/19.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/19",
        created = "2017-11-04T22:28:13.756Z"
    ),
    Character(
        id = 20,
        name = R.string.ants_in_my_eyes_johnson,
        status = "unknown",
        species = "Human",
        type = "Human with ants in his eyes",
        gender = "Male",
        origin = Origin(name = "unknown", url = ""),
        location = Location(name = "Interdimensional Cable", url = "https://rickandmortyapi.com/api/location/6"),
        image = "https://rickandmortyapi.com/api/character/avatar/20.jpeg",
        episode = listOf("https://rickandmortyapi.com/api/episode/8"),
        url = "https://rickandmortyapi.com/api/character/20",
        created = "2017-11-04T22:34:53.659Z"
    )
)
