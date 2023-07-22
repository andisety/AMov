package com.andi.amov.di

import com.andi.amov.core.domain.usecase.MovieInteractor
import com.andi.amov.core.domain.usecase.MovieUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun provideTourismUseCase(movieInteractor: MovieInteractor): MovieUseCase

}
