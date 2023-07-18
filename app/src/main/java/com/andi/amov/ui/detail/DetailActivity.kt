package com.andi.amov.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.andi.amov.R
import com.andi.amov.core.domain.model.Movie
import com.andi.amov.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityDetailBinding
    private val detailMovieViewModel :DetailMovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val movieDetail = intent.getParcelableExtra<Movie>(EXTRA_DATA)
        showDetailMovie(movieDetail)
    }

    private fun showDetailMovie(movieDetail: Movie?) {
        movieDetail?.let {
            supportActionBar?.title = movieDetail.title
            binding.content.tvDetailDescription.text = movieDetail.overview
            binding.content.rBar.rating = (movieDetail.vote_average/2).toFloat()
            Glide.with(this@DetailActivity)
                .load("http://image.tmdb.org/t/p/w500/${movieDetail.poster_path}")
                .into(binding.ivDetailImage)

            var statusFavorite = movieDetail.isFavorite
            setStatusFavorite(statusFavorite)
            binding.fab.setOnClickListener {
                statusFavorite = !statusFavorite
                detailMovieViewModel.setFavoriteTourism(movieDetail, statusFavorite)
                setStatusFavorite(statusFavorite)
            }
        }
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite) {
            binding.fab.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_favorite_white))
        } else {
            binding.fab.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_not_favorite_white))
        }
    }
}