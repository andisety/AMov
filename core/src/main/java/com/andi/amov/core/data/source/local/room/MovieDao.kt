package com.andi.amov.core.data.source.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.andi.amov.core.data.source.local.entity.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    @Query("SELECT * FROM movies")
    fun getAllTourism(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movies where isFavorite = 1")
    fun getFavoriteTourism(): Flow<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTourism(tourism: List<MovieEntity>)

    @Update
    fun updateFavoriteTourism(tourism: MovieEntity)
}

