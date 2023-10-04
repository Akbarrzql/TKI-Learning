package com.example.project1tki.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project1tki.adapter.ArtistAdapter
import com.example.project1tki.data.artist.Artist
import com.example.project1tki.data.artist.DummyArtist
import com.example.project1tki.databinding.FragmentArtistBinding


class ArtistsFragment : Fragment() {

    private var _binding: FragmentArtistBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<Artist> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentArtistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.addAll(DummyArtist.listArtist)
        showRecyclerCardView()
        searchArtist()
    }
    
    private fun searchArtist(){
        binding.etSearch.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Do Nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                list.clear()
                list.addAll(DummyArtist.listArtist.filter { it.nameArtist.contains(s.toString(), ignoreCase = true) })
                showRecyclerCardView()
            }

            override fun afterTextChanged(s: Editable?) {
                // Do Nothing
            }

        })
    }

    private fun showRecyclerCardView() {
        binding.rvArtist.setHasFixedSize(true)
        binding.rvArtist.layoutManager = LinearLayoutManager(context)
        val cardViewProductAdapter = ArtistAdapter(list)
        binding.rvArtist.adapter = cardViewProductAdapter
    }
}