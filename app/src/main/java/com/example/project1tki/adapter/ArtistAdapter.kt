package com.example.project1tki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.project1tki.data.artist.Artist
import com.example.project1tki.databinding.ItemArtistBinding

class ArtistAdapter(private val listArtist: ArrayList<Artist>): RecyclerView.Adapter<ArtistAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemArtistBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemArtistBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return listArtist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val artist = listArtist[position]

        holder.binding.apply {
            tvName.text = artist.nameArtist
            tvJobdesc.text = artist.jobDesc
            Glide.with(holder.itemView)
                .load(artist.photo)
                .into(ivProfile)
        }
    }


}