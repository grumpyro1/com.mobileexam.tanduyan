package com.example.commobileexamtanduyan.network

import CharacterResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

//private const val BASE_URL = "https://rickandmortyapi.com/api/"
private const val BASE_URL = "https://rickandmortyapi.com/api/"

private val retrofit = Retrofit.Builder()
//    .addConverterFactory(ScalarsConverterFactory.create())
    .addConverterFactory(GsonConverterFactory.create()) // Change this
    .baseUrl(BASE_URL)
    .build()

interface CharactersApiService {
    @GET("character")
    suspend fun getCharacters(): CharacterResponse
}

