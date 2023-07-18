package com.andi.amov.ui.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.andi.amov.core.domain.usecase.MovieUseCase


class FavoriteViewModel  (movieUseCase: MovieUseCase) : ViewModel() {
    val favoriteMovies = movieUseCase.getFavoriteMovie().asLiveData()
}
