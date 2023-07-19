package com.andi.amov.core.data.source.remote.network

import com.andi.amov.core.data.source.remote.response.ResponseMovies
import retrofit2.http.GET

interface ApiService {
    @GET("movie/popular?api_key=a68bd20074fdd9c9d53697376998cabd")
    suspend fun getList(): ResponseMovies
}
