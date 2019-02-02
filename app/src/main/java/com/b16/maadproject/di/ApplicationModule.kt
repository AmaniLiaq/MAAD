package com.b16.maadproject.di

import com.b16.maadproject.network.ApiClient
import com.b16.maadproject.network.CharacterService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Singleton
    @Provides
    fun providesCharacterService(): CharacterService {
        return CharacterService.create()
    }

    @Singleton
    @Provides
    fun provideApiClient(characterService: CharacterService): ApiClient{
        return ApiClient(characterService)
    }
}