package com.b16.maadproject.network

import com.b16.maadproject.model.CharacterList
import io.reactivex.Observable

class ApiClient(private val characterService: CharacterService) {

    fun getCharacters(type: String): Observable<CharacterList> {
        return characterService.getCharacterList(type, "json")
    }
}