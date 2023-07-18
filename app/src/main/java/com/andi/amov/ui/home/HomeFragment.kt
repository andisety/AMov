package com.andi.amov.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.andi.amov.core.data.Resource
import com.andi.amov.core.ui.MovieAdapter
import com.andi.amov.databinding.FragmentHomeBinding
import com.andi.amov.ui.detail.DetailActivity
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {
    private val homeViewModel: HomeViewModel by viewModel()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity!=null){
            val movieAdapter = MovieAdapter()
            movieAdapter.onItemClick = {selectedData->
                val intent = Intent(activity,DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA,selectedData)
                startActivity(intent)
            }
            homeViewModel.movie.observe(viewLifecycleOwner){movies->
                if (movies!=null){
                    when(movies){
                        is Resource.Loading->binding.pgBar.visibility = View.VISIBLE
                        is Resource.Success-> {
                            binding.pgBar.visibility = View.GONE
                            movieAdapter.setData(movies.data)
                        }
                        is Resource.Error->{
                            binding.pgBar.visibility = View.VISIBLE
                            binding.tvError.visibility = View.VISIBLE
                        }

                    }

                }
            }
            with(binding.rcList) {
                val lm = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
                layoutManager = lm
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}