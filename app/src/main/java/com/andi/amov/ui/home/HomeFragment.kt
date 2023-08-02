package com.andi.amov.ui.home

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.andi.amov.core.data.Resource
import com.andi.amov.core.ui.MovieAdapter
import com.andi.amov.databinding.FragmentHomeBinding
import com.andi.amov.ui.detail.DetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var broadcastReceiver: BroadcastReceiver
    private val homeViewModel: HomeViewModel by viewModels()
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
                val lm = GridLayoutManager(activity,2 )
                layoutManager = lm
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    private fun registerBroadCastReceiver() {
        broadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                when (intent.action) {
                    Intent.ACTION_POWER_CONNECTED -> {
                        Toast.makeText(activity,"Connected",Toast.LENGTH_SHORT).show()
                    }
                    Intent.ACTION_POWER_DISCONNECTED -> {
                        Toast.makeText(activity,"Disconnected",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        val intentFilter = IntentFilter()
        intentFilter.apply {
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }
        activity?.registerReceiver(broadcastReceiver, intentFilter)
    }


    override fun onStart() {
        super.onStart()
        registerBroadCastReceiver()
    }

    override fun onStop() {
        super.onStop()
        activity?.unregisterReceiver(broadcastReceiver)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}