package com.andi.amov.core.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MovieEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "movieId")
    var movieId: Int,
    @ColumnInfo(name = "title")
    var title: String ,
    @ColumnInfo(name = "poster_path")
    var poster_path: String ,
    @ColumnInfo(name = "popularity")
    var popularity: Double ,
    @ColumnInfo(name = "overview")
    var overview: String ,
    @ColumnInfo(name = "release_date")
    var release_date: String ,
    @ColumnInfo(name = "vote_average")
    var vote_average: Double ,
    @ColumnInfo(name = "isFavorite")
    var isFavorite: Boolean = false
)
