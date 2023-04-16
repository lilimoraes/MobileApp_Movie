package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movie.Adapter.AdapterMovie
import model.Movie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RecyclerView_movies = findViewById<RecyclerView>(R.id.recyclerView_movies)
        RecyclerView_movies.layoutManager = LinearLayoutManager(this)
        RecyclerView_movies.setHasFixedSize(true)

        val listMovies: MutableList<Movie> = mutableListOf()
        val adapterMovie = AdapterMovie(this, listMovies)
        RecyclerView_movies.adapter = adapterMovie

        val movie1 = Movie(
            R.drawable.john,
        "JOHN WICK: CHAPTER 4",
        "John Wick (Keanu Reeves) uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
        "5"
        )
        listMovies.add(movie1)

        val movie2 = Movie(
            R.drawable.mario,
            "THE SUPER MARIO BROS. MOVIE",
            "A plumber named Mario travels through an underground labyrinth with his brother, Luigi, trying to save a captured princess.",
            "6"
        )
        listMovies.add(movie2)

        val movie3 = Movie(
            R.drawable.pathaan,
            "PATHAAN",
            "Make. Some. Noise! 'Pathaan' is here! The high-octane spy thriller 'Pathaan' starring Shah Rukh Khan, Deepika Padukone and John Abraham, directed by Siddharth Anand is set to release on January 25, 2023.",
            "10"
        )
        listMovies.add(movie3)

        val movie4 = Movie(
            R.drawable.suzume,
            "SUZUME",
            "On the other side of the door, was time in its entirety... As the skies turn red and the earth trembles, Japan stands on the brink of disaster. But one determined teenager, Suzume, sets out on a mission to save her country.",
            "9"
        )
        listMovies.add(movie4)
    }
}