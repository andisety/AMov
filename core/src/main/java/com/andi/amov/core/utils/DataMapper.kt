package com.dicoding.tourismapp.core.utils

import com.andi.amov.core.data.source.local.entity.MovieEntity
import com.andi.amov.core.data.source.remote.response.ResultsItem
import com.andi.amov.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<ResultsItem>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                it.id,
                it.title,
                it.posterPath,
                it.popularity,
                it.overview,
                it.releaseDate,
                it.voteAverage,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                it.movieId,
               it.title,
                it.poster_path,
                it.popularity,
                it.overview,
                it.release_date,
                it.vote_average,
                 it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        input.movieId,
        input.title,
        input.poster_path,
        input.popularity,
        input.overview,
        input.release_date,
        input.vote_average,
        input.isFavorite
    )
}