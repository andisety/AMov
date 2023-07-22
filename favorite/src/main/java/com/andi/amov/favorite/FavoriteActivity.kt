package com.andi.amov.favorite

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.andi.amov.core.domain.model.Movie
import com.andi.amov.core.ui.MovieAdapter
import com.andi.amov.di.FavoriteModuleDepedencies
import com.andi.amov.favorite.databinding.ActivityFavoriteBinding
import com.andi.amov.ui.detail.DetailActivity
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

class FavoriteActivity : AppCompatActivity() {

    @Inject
    lateinit var factory:ViewModelFactory

    private val favoriteViewModel:FavoriteViewModels by viewModels{
        factory
    }

    lateinit var binding:ActivityFavoriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerFavoriteComponent.builder()
            .context(this)
            .appDependencies(
                EntryPointAccessors.fromApplication(
                    applicationContext,
                    FavoriteModuleDepedencies::class.java
                )
            )
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Favorite"

        favoriteViewModel.movieList.observe(this) { dataMovie ->
            setupRecyclerView(dataMovie)
        }

    }

    private fun setupRecyclerView(dataMovie:List<Movie>?) {

        if (dataMovie!=null){
            binding.viewEmpty.visibility = View.GONE
            val movieAdapter = MovieAdapter()
            movieAdapter.onItemClick = { selectedData ->
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
                startActivity(intent)
            }
            movieAdapter.setData(dataMovie)
            with(binding.rvTourism) {
                val lm = GridLayoutManager(this@FavoriteActivity,2 )
                layoutManager = lm
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }else{
            binding.viewEmpty.visibility = View.VISIBLE
        }

    }
}