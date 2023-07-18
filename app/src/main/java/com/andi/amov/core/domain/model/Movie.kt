package com.andi.amov.core.domain.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val movieId: Int,
    val title: String ,
    val poster_path: String ,
    val popularity: Double ,
    val overview: String ,
    val release_date: String ,
    val vote_average: Double ,
    val isFavorite: Boolean = false
):Parcelable