package com.andi.amov.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.andi.amov.core.domain.usecase.MovieUseCase


class HomeViewModel (movieUseCase: MovieUseCase) : ViewModel() {

    val movie = movieUseCase.getAllMovie().asLiveData()

}