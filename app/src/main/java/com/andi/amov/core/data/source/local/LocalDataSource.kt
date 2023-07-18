package com.andi.amov.core.data.source.local

import com.andi.amov.core.data.source.local.entity.MovieEntity
import com.andi.amov.core.data.source.local.room.MovieDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(private val movieDao: MovieDao) {

    fun getAllTourism(): Flow<List<MovieEntity>> = movieDao.getAllTourism()

    fun getFavoriteTourism(): Flow<List<MovieEntity>> = movieDao.getFavoriteTourism()

    suspend fun insertTourism(tourismList: List<MovieEntity>) = movieDao.insertTourism(tourismList)

    fun setFavoriteTourism(tourism: MovieEntity, newState: Boolean) {
        tourism.isFavorite = newState
        movieDao.updateFavoriteTourism(tourism)
    }
}