package com.example.commobileexamtanduyan.data.dataclass

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.commobileexamtanduyan.R
import com.example.commobileexamtanduyan.R.drawable

data class Character(
    val characterList: List<Character> = emptyList(),
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