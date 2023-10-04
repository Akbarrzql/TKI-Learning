package com.example.project1tki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.project1tki.data.people.People
import com.example.project1tki.databinding.ItemFriendsBinding

class PeopleAdapter(private val listPeople: ArrayList<People>): RecyclerView.Adapter<PeopleAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemFriendsBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFriendsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return listPeople.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val people = listPeople[position]

        holder.binding.apply {
            tvName.text = people.namePeople
            tvJobdescPeople.text = people.jobdescPeople
            Glide.with(holder.itemView)
                .load(people.imagePeople)
                .into(civUser)
        }
    }


}