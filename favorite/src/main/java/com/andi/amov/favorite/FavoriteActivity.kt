package com.andi.amov.favorite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.andi.amov.core.data.Resource
import com.andi.amov.core.domain.model.Movie
import com.andi.amov.core.ui.MovieAdapter
import com.andi.amov.favorite.databinding.ActivityFavoriteBinding
import com.andi.amov.favorite.di.favoriteModule
import com.andi.amov.ui.detail.DetailActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding:ActivityFavoriteBinding
    private val favoriteViewModel: FavoritesViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadKoinModules(favoriteModule)
        getFavoriteData()


    }

    private fun getFavoriteData(){

        favoriteViewModel.favoriteMovies.observe(this){movies->
            when(movies){
                is Resource.Loading ->{
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Resource.Error ->{
                    binding.progressBar.visibility = View.GONE

                }
                is Resource.Success ->{
                    binding.progressBar.visibility = View.GONE
                    if (movies.data!=null){
                        initRecyclerView(movies.data)
                    }else{
                        binding.viewEmpty.visibility = View.GONE
                    }

                }
            }
        }



    }

    private fun initRecyclerView(movies:List<Movie>?){
        val movieAdapter = MovieAdapter()
        movieAdapter.onItemClick = { selectedData ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
            startActivity(intent)
        }
        movieAdapter.setData(movies)
        with(binding.rvTourism) {
            val lm = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            layoutManager = lm
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }
}