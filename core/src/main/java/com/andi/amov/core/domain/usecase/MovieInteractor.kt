package com.andi.amov.core.domain.usecase

import com.andi.amov.core.domain.model.Movie
import com.andi.amov.core.domain.repository.IMovieRepository
import javax.inject.Inject

class MovieInteractor @Inject constructor(private val movieRepository: IMovieRepository): MovieUseCase {

    override fun getAllMovie() = movieRepository.getAllTourism()

    override fun getFavoriteMovie() = movieRepository.getFavoriteTourism()

    override fun setFavoriteMovie(movie: Movie, state: Boolean) = movieRepository.setFavoriteTourism(movie, state)
}