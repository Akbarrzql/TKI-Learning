package com.example.project1tki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.project1tki.databinding.ActivityMainBinding
import com.example.project1tki.fragment.ArtistsFragment
import com.example.project1tki.fragment.FriendsFragment
import com.example.project1tki.fragment.ShoppingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setCurrentFragment(ShoppingFragment())

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    setCurrentFragment(ShoppingFragment())
                }
                R.id.page_2 -> {
                    setCurrentFragment(ArtistsFragment())
                }
                R.id.page_3 -> {
                    setCurrentFragment(FriendsFragment())
                }
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container,fragment)
            commit()
        }
}