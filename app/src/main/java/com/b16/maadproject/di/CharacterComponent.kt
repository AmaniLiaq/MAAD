package com.b16.maadproject.di

import com.b16.maadproject.CharacterApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ApplicationModule::class])
interface CharacterComponent {
    fun inject(target: CharacterApplication)
}