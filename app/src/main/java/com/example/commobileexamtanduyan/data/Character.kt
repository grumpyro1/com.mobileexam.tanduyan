package com.example.commobileexamtanduyan.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.commobileexamtanduyan.R
import com.example.commobileexamtanduyan.R.drawable

//data class ApiResponse(
//    val info: Info,
//    val results: List<Character> // characters
//)
//data class Info(
//    val count: Int,
//    val pages: Int,
//    val next: String?,
//    val prev: String?
//)
data class Character(
    val id: Int,
    @StringRes val name: Int,
    @StringRes val status: Int,
    @StringRes val species: Int,
    @StringRes val type: Int,
    @StringRes val gender: Int,
    val origin: Origin,
    val location: Location,
    @DrawableRes val image: Int,
    val episode: List<String>,
    val url: String,
    val created: String
)
data class Origin(
    @StringRes val name: Int,
    val url: String
)

data class Location(
    @StringRes  val name: Int,
    val url: String
)
val characters = listOf(
    Character(
        id = 1,
        name = R.string.rick_sanchez,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_genetic_experiment,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.earth_c137, url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = R.string.earth_c137, url = "https://rickandmortyapi.com/api/location/3"),
        image = R.drawable.one,
        episode = listOf("https://rickandmortyapi.com/api/episode/1"),
        url = "https://rickandmortyapi.com/api/character/1",
        created = "2017-11-04T18:48:46.250Z"
    ),
    Character(
        id = 2,
        name = R.string.morty_smith,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.replacement_dimension, url = "https://rickandmortyapi.com/api/location/3"),
        image = R.drawable.two,
        episode = listOf("https://rickandmortyapi.com/api/episode/1"),
        url = "https://rickandmortyapi.com/api/character/2",
        created = "2017-11-04T18:50:21.651Z"
    ),
    Character(
        id = 3,
        name = R.string.summer_smith,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_female,
        origin = Origin(name = R.string.replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = R.string.replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image = R.drawable.three,
        episode = listOf("https://rickandmortyapi.com/api/episode/6"),
        url = "https://rickandmortyapi.com/api/character/3",
        created = "2017-11-04T19:09:56.428Z"
    ),
    Character(
        id = 4,
        name = R.string.beth_smith,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_female,
        origin = Origin(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image =R.drawable.four,
        episode = listOf("https://rickandmortyapi.com/api/episode/6"),
        url = "https://rickandmortyapi.com/api/character/4",
        created = "2017-11-04T19:22:43.665Z"
    ),
    Character(
        id = 5,
        name = R.string.jerry_smith,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image = R.drawable.five,
        episode = listOf("https://rickandmortyapi.com/api/episode/6"),
        url = "https://rickandmortyapi.com/api/character/5",
        created = "2017-11-04T19:26:56.301Z"
    ),
    Character(
        id = 6,
        name = R.string.abadango_cluster_princess,
        status = R.string.status_alive,
        species = R.string.species_alien,
        type = R.string.type_parasite,
        gender = R.string.gender_female,
        origin = Origin(name = R.string.abadango, url = "https://rickandmortyapi.com/api/location/2"),
        location = Location(name = R.string.abadango, url = "https://rickandmortyapi.com/api/location/2"),
        image = R.drawable.six,
        episode = listOf("https://rickandmortyapi.com/api/episode/27"),
        url = "https://rickandmortyapi.com/api/character/6",
        created = "2017-11-04T19:50:28.250Z"
    ),
    Character(
        id = 7,
        name = R.string.abradolf_lincler,
        status = R.string.status_unknown,
        species = R.string.species_human,
        type = R.string.type_genetic_experiment,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = R.string.testicle_monster_dimension, url = "https://rickandmortyapi.com/api/location/21"),
        image = R.drawable.seven,
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/7",
        created = "2017-11-04T19:59:20.523Z"
    ),
    Character(
        id = 8,
        name = R.string.adjudicator_rick,
        status = R.string.status_dead,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.citadel_of_ricks, url = "https://rickandmortyapi.com/api/location/3"),
        image = R.drawable.eight,
        episode = listOf("https://rickandmortyapi.com/api/episode/28"),
        url = "https://rickandmortyapi.com/api/character/8",
        created = "2017-11-04T20:03:34.737Z"
    ),
    Character(
        id = 9,
        name = R.string.agency_director,
        status = R.string.status_dead,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        location = Location(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image = R.drawable.nine,
        episode = listOf("https://rickandmortyapi.com/api/episode/24"),
        url = "https://rickandmortyapi.com/api/character/9",
        created = "2017-11-04T20:06:54.976Z"
    ),
    Character(
        id = 10,
        name = R.string.alan_rails,
        status = R.string.status_dead,
        species = R.string.species_human,
        type = R.string.type_superhuman_ghost_trains_summoner,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.worldenders_lair, url = "https://rickandmortyapi.com/api/location/4"),
        image = R.drawable.ten,
        episode = listOf("https://rickandmortyapi.com/api/episode/25"),
        url = "https://rickandmortyapi.com/api/character/10",
        created = "2017-11-04T20:19:09.017Z"
    ),
    Character(
        id = 11,
        name = R.string.albert_einstein,
        status = R.string.status_dead,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.earth_c137, url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image = R.drawable.eleven,
        episode = listOf("https://rickandmortyapi.com/api/episode/12"),
        url = "https://rickandmortyapi.com/api/character/11",
        created = "2017-11-04T20:20:20.965Z"
    ),
    Character(
        id = 12,
        name = R.string.alexander,
        status = R.string.status_dead,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.earth_c137, url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = R.string.anatomy_park, url = "https://rickandmortyapi.com/api/location/5"),
        image = R.drawable.twenty,
        episode = listOf("https://rickandmortyapi.com/api/episode/3"),
        url = "https://rickandmortyapi.com/api/character/12",
        created = "2017-11-04T20:32:33.144Z"
    ),
    Character(
        id = 13,
        name = R.string.alien_googah,
        status = R.string.status_unknown,
        species = R.string.species_alien,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_unknown,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image = R.drawable.thirteen,
        episode = listOf("https://rickandmortyapi.com/api/episode/31"),
        url = "https://rickandmortyapi.com/api/character/13",
        created = "2017-11-04T20:33:30.779Z"
    ),
    Character(
        id = 14,
        name = R.string.alien_morty,
        status = R.string.status_unknown,
        species = R.string.species_alien,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.citadel_of_ricks, url = "https://rickandmortyapi.com/api/location/3"),
        image = R.drawable.fourteen,
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/14",
        created = "2017-11-04T20:51:31.373Z"
    ),
    Character(
        id = 15,
        name = R.string.alien_rick,
        status = R.string.status_unknown,
        species = R.string.species_alien,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.citadel_of_ricks, url = "https://rickandmortyapi.com/api/location/3"),
        image =  R.drawable.fifteen,
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/15",
        created = "2017-11-04T20:56:13.215Z"
    ),
    Character(
        id = 16,
        name = R.string.amish_cyborg,
        status = R.string.status_dead,
        species = R.string.species_alien,
        type = R.string.type_parasite,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.earth_replacement_dimension, url = "https://rickandmortyapi.com/api/location/20"),
        image =  R.drawable.sixteen,
        episode = listOf("https://rickandmortyapi.com/api/episode/15"),
        url = "https://rickandmortyapi.com/api/character/16",
        created = "2017-11-04T21:12:45.235Z"
    ),
    Character(
        id = 17,
        name = R.string.annie,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_female,
        origin = Origin(name = R.string.earth_c137, url = "https://rickandmortyapi.com/api/location/1"),
        location = Location(name = R.string.anatomy_park, url = "https://rickandmortyapi.com/api/location/5"),
        image =  R.drawable.seventeen,
        episode = listOf("https://rickandmortyapi.com/api/episode/3"),
        url = "https://rickandmortyapi.com/api/character/17",
        created = "2017-11-04T22:21:24.481Z"
    ),
    Character(
        id = 18,
        name = R.string.antenna_morty,
        status = R.string.status_alive,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.citadel_of_ricks, url = "https://rickandmortyapi.com/api/location/3"),
        image =  R.drawable.eighteen,
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/18",
        created = "2017-11-04T22:25:29.008Z"
    ),
    Character(
        id = 19,
        name = R.string.antenna_rick,
        status = R.string.status_unknown,
        species = R.string.species_human,
        type = R.string.type_human_with_antennae,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.unknown, url = ""),
        image =  R.drawable.nineteen,
        episode = listOf("https://rickandmortyapi.com/api/episode/10"),
        url = "https://rickandmortyapi.com/api/character/19",
        created = "2017-11-04T22:28:13.756Z"
    ),
    Character(
        id = 20,
        name = R.string.ants_in_my_eyes_johnson,
        status = R.string.status_unknown,
        species = R.string.species_human,
        type = R.string.type_human_with_ants_in_eyes,
        gender = R.string.gender_male,
        origin = Origin(name = R.string.unknown, url = ""),
        location = Location(name = R.string.interdimensional_cable, url = "https://rickandmortyapi.com/api/location/6"),
        image =  R.drawable.twenty,
        episode = listOf("https://rickandmortyapi.com/api/episode/8"),
        url = "https://rickandmortyapi.com/api/character/20",
        created = "2017-11-04T22:34:53.659Z"
    )
)