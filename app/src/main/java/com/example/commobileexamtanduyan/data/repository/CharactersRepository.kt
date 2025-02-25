package com.example.commobileexamtanduyan.data.repository

import CharacterResponse
import com.example.commobileexamtanduyan.network.CharactersApiService

interface CharactersRepository {
    suspend fun getCharacters(): CharacterResponse
}
class NetworkCharactersRepository(
    private val charactersApiService: CharactersApiService
) : CharactersRepository {
    override suspend fun getCharacters(): CharacterResponse = charactersApiService.getCharacters()
    }
