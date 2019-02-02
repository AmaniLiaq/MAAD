package com.b16.maadproject.screen.model

import com.b16.maadproject.model.Character
import com.b16.maadproject.model.CharacterType
import com.b16.maadproject.network.ApiClient
import io.reactivex.Observable
import javax.inject.Inject

class MainActivityModel @Inject constructor(private val apiClient: ApiClient) {

    fun loadCharacters(characterType: CharacterType): Observable<List<Character>> {
        return apiClient.getCharacters(characterType.type).map { it.characterList }
    }
}