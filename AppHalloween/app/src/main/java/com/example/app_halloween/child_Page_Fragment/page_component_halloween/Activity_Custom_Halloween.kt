package com.example.app_halloween.child_Page_Fragment.page_component_halloween

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.example.app_halloween.R
import com.example.app_halloween.data_Api_Halloween.Film_Api.model_api_halloween.halloween_film
import com.google.gson.Gson
import kotlin.math.log

class Activity_Custom_Halloween : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_item_layout)


        val TitoloFilm = findViewById<TextView>(R.id.TitleMovie)
        val ImmagineFilm = findViewById<ImageView>(R.id.MovieFilm)
        val star = findViewById<TextView>(R.id.TitleStar)

        val url : String = "https://mocki.io/v1/81d59511-6eb2-4ce0-af0d-d4ff41b8b49b"
        val requestFilm = Volley.newRequestQueue(this)


        val requestFilmJson = JsonObjectRequest(
            Request.Method.GET , url, null,
            Response.Listener{
                response ->
                val film = Gson().fromJson(response.toString(),halloween_film::class.java)

                Glide.with(this).load(film.halloween).into(ImmagineFilm)

            },
            { error ->
            }
        )
        requestFilm.add(requestFilmJson)
    }

}