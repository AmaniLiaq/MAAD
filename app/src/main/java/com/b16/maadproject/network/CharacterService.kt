package com.b16.maadproject.network

import com.b16.maadproject.model.CharacterList
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterService {

    @GET(".")
    fun getCharacterList(
        @Query("q") characterType: String,
        @Query("format") responseFormat: String
    ): Observable<CharacterList>

    companion object Creator {
        fun create(): CharacterService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.duckduckgo.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(CharacterService::class.java)
        }
    }
}