package com.andi.amov.favorite.di

import com.andi.amov.ui.favorite.FavoriteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favoriteModule = module{
    viewModel{FavoriteViewModel(get())}
}