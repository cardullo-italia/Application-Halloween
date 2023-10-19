package com.example.fad_its.InsideApplication.MenuNavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.bumptech.glide.manager.SupportRequestManagerFragment
import com.example.fad_its.InsideApplication.ScreenApplication.CalendarActivity
import com.example.fad_its.InsideApplication.ScreenApplication.CalendarioFragment
import com.example.fad_its.InsideApplication.ScreenApplication.CourseActivity
import com.example.fad_its.InsideApplication.ScreenApplication.HomepageActivity
import com.example.fad_its.InsideApplication.ScreenApplication.HomepageFragment
import com.example.fad_its.InsideApplication.ScreenApplication.ProfileActivity
import com.example.fad_its.InsideApplication.ScreenApplication.WorldITSActivity
import com.example.fad_its.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MenuBottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_bottom_navigation)

        val Navigation = findViewById<BottomNavigationView>(R.id.Navigation_App)

        Navigation.setOnItemSelectedListener {
            item -> when(item.itemId)
            {
                R.id.homepage -> {
                    Log.d("homepage", "Sei dentro Homepage")
                    val homepage = HomepageFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerTwo,homepage)
                        .commit()
                   // val intent = Intent(this, HomepageActivity::class.java)
                   // startActivity(intent)

                    true
                }
                R.id.course -> {
                    Log.d("Corsi", "Sei dentro Corsi")
                    //val intent = Intent(this, CourseActivity::class.java)
                    //startActivity(intent)
                    true
                }
                R.id.calendar -> {
                    Log.d("Calendario","Sei dentro Calendario")
                   // val intent = Intent(this,CalendarActivity::class.java)
                   // startActivity(intent)
                    val calendario = CalendarioFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerTwo,calendario)
                        .commit()
                    true
                }
                R.id.world_its -> {
                    Log.d("World","Sei dentro World")
                   // val intent = Intent(this,WorldITSActivity::class.java)
                   //startActivity(intent)
                    true
                }
                R.id.profile -> {
                    Log.i("Profilo","Sei dentro Profilo")
                   // val intent = Intent(this,ProfileActivity::class.java)
                   // startActivity(intent)
                    true
                }

              else -> false

            }


        }
        NavigationBarView.LABEL_VISIBILITY_UNLABELED

        /*supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, NavigationTopBarFragment())
            .commit()*/
    }
}