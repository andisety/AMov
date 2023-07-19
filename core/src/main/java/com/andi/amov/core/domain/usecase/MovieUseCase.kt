package com.andi.amov.core.domain.usecase

import com.andi.amov.core.domain.model.Movie
import com.andi.amov.core.data.Resource
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getAllMovie(): Flow<com.andi.amov.core.data.Resource<List<Movie>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
}