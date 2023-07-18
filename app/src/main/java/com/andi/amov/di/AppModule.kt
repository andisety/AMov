package com.andi.amov.di

import com.andi.amov.core.domain.usecase.MovieInteractor
import com.andi.amov.core.domain.usecase.MovieUseCase
import com.andi.amov.ui.detail.DetailMovieViewModel
import com.andi.amov.ui.favorite.FavoriteViewModel
import com.andi.amov.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}
