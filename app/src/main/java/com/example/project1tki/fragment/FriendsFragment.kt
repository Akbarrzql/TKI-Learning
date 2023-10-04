package com.example.project1tki.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project1tki.adapter.PeopleAdapter
import com.example.project1tki.adapter.ShoppingAdapter
import com.example.project1tki.data.artist.DummyArtist
import com.example.project1tki.data.people.DummyPeople
import com.example.project1tki.data.people.People
import com.example.project1tki.databinding.FragmentFriendsBinding

class FriendsFragment : Fragment() {

    private var _binding: FragmentFriendsBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<People> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFriendsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.addAll(DummyPeople.listData)
        showRecyclerCardView()
        searchFriends()
    }

    private fun searchFriends(){
        binding.etSearch.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Do Nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                list.clear()
                list.addAll(DummyPeople.listData.filter { it.namePeople.contains(s.toString(), ignoreCase = true) })
                showRecyclerCardView()
            }

            override fun afterTextChanged(s: Editable?) {
                // Do Nothing
            }

        })
    }

    private fun showRecyclerCardView() {
        binding.rvPeople.setHasFixedSize(true)
        binding.rvPeople.layoutManager = LinearLayoutManager(context)
        val cardViewPeopleAdapter = PeopleAdapter(list)
        binding.rvPeople.adapter = cardViewPeopleAdapter
    }
}