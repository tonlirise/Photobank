package com.example.photobank.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.photobank.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btmNovigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        btmNovigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.page_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.id_fragment_container, HomeFragment())
                        .commit()
                    Toast.makeText(this, "Home page", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.id_fragment_container, SearchFragment())
                        .commit()
                    Toast.makeText(this, "Search page", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_share -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.id_fragment_container, ShareFragment())
                        .commit()
                    Toast.makeText(this, "Share page", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_like -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.id_fragment_container, LikeFragment())
                        .commit()
                    Toast.makeText(this, "Like page", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.id_fragment_container, ProfileFragment())
                        .commit()
                    Toast.makeText(this, "Profile page", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }

            return@setOnItemSelectedListener true
        }

    }
}