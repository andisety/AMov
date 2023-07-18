package com.andi.amov.ui.detail

import androidx.lifecycle.ViewModel
import com.andi.amov.core.domain.model.Movie
import com.andi.amov.core.domain.usecase.MovieUseCase


class DetailMovieViewModel  (private val movieUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteTourism(movie: Movie, newStatus:Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}

