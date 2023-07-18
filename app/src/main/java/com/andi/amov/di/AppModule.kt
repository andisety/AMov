package com.andi.amov.di

import com.andi.amov.core.domain.usecase.MovieInteractor
import com.andi.amov.core.domain.usecase.MovieUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {

    @Binds
    @ViewModelScoped
    abstract fun provideTourismUseCase(movieInteractor: MovieInteractor): MovieUseCase

}
