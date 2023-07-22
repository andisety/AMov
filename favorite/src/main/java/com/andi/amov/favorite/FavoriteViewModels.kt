package com.andi.amov.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.andi.amov.core.domain.usecase.MovieUseCase


class FavoriteViewModels (movieUseCase: MovieUseCase): ViewModel() {
    val movieList = movieUseCase.getFavoriteMovie().asLiveData()
}