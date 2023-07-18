package com.andi.amov.core.domain.repository

import com.andi.amov.core.domain.model.Movie
import com.andi.amov.core.data.Resource
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {

    fun getAllTourism(): Flow<Resource<List<Movie>>>

    fun getFavoriteTourism(): Flow<List<Movie>>

    fun setFavoriteTourism(movie: Movie, state: Boolean)

}