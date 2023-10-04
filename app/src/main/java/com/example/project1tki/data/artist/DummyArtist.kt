package com.example.project1tki.data.artist

import com.example.project1tki.R

object DummyArtist {
    private val nameArtist = arrayOf(
        "JaneDoe",
        "DanyDoe",
        "AhmadDoe",
    )

    private val jobDesc = arrayOf(
        "Penyanyi",
        "Penyanyi",
        "Penyanyi",
    )

    private val rating = arrayOf(
        "5",
        "4.5",
        "4",
    )

    private val photo = intArrayOf(
        R.drawable.person1,
        R.drawable.person2,
        R.drawable.person3,
    )

    val listArtist : ArrayList<Artist>
        get() {
            val list = arrayListOf<Artist>()
            for (position in nameArtist.indices) {
                val artist = Artist()
                artist.nameArtist = nameArtist[position]
                artist.jobDesc = jobDesc[position]
                artist.rating = rating[position]
                artist.photo = photo[position]
                list.add(artist)
            }
            return list
        }
}