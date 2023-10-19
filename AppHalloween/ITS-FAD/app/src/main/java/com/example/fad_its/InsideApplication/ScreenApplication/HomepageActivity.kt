package com.example.fad_its.InsideApplication.ScreenApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fad_its.ElementApplicationCustom.CardMediaAssenza.MediaAssenzaCardFragment
import com.example.fad_its.R

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        //activity che controlla solo il suo interno SOLAMENTE


        // qui ci devono stare i fragment :(
        //inserimento del fragment delle card Assenza e Media
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentAssenzaContainer,MediaAssenzaCardFragment())
            .commit()



    //inserimento dell'orario scolastico



    }
}