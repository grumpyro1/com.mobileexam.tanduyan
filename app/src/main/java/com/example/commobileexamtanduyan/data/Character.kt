package com.example.commobileexamtanduyan.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Character(

    val days: Int,
    @StringRes val name: Int,
    @StringRes val status: Int,
    @StringRes val species: Int,
    @StringRes val type: Int,
    @StringRes val gender: Int,
    @DrawableRes val imageRes: Int,
)

val Characters = listOf(
    Character()
)
