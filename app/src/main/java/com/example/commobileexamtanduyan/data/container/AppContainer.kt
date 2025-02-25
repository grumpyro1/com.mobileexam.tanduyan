package com.example.commobileexamtanduyan.data.container

import com.example.commobileexamtanduyan.data.repository.CharactersRepository
import com.example.commobileexamtanduyan.data.repository.NetworkCharactersRepository
import com.example.commobileexamtanduyan.network.CharactersApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val charactersRepository: CharactersRepository
}
class DefaultAppContainer : AppContainer {
    private val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retrofit = Retrofit.Builder()
//    .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create()) // Change this
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: CharactersApiService by lazy {
        retrofit.create(CharactersApiService::class.java)
    }

    override val charactersRepository: CharactersRepository  by lazy {
        NetworkCharactersRepository(retrofitService)
    }

}