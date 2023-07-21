package com.andi.amov.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.andi.amov.core.domain.usecase.MovieUseCase


class FavoritesViewModel  (movieUseCase: MovieUseCase) : ViewModel() {
    val favoriteMovies = movieUseCase.getAllMovie().asLiveData()
}
