package com.example.app_halloween

import android.graphics.LinearGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_halloween.pages.fragment_page.FilmFragment
import com.example.app_halloween.pages.fragment_page.Homepage_Fragment
import com.example.app_halloween.pages.fragment_page.LeggendeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.tabs.TabLayout.LabelVisibility
import com.google.android.material.tabs.TabLayout.TAB_LABEL_VISIBILITY_UNLABELED

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //insert the bottom navigation
        val bottomNavigationHalloween = findViewById<BottomNavigationView>(R.id.bottomnav)
        bottomNavigationHalloween.itemActiveIndicatorColor = getColorStateList(R.color.trasparent)

        bottomNavigationHalloween.setOnItemSelectedListener { item ->
            when(item.itemId)
            {
                R.id.homepage -> {
                    val homepage = Homepage_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.ContainerforFragment,homepage)
                        .commit()
                    true
                }

                R.id.film -> {
                    val film = FilmFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.ContainerforFragment,film)
                        .commit()
                    true
                }

                R.id.leggende -> {
                    val leggende = LeggendeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.ContainerforFragment,leggende)
                        .commit()
                    true
                }

                else -> false

            }
        }

    }
}