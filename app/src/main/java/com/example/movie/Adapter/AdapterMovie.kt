package com.example.movie.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movie.R
import model.Movie

private var Any.text: String
    get() {}
    set(B){}


class AdapterMovie(private val context: Context, private val movies: MutableList<Movie>): RecyclerView.Adapter<AdapterMovie.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemList = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false)
        val holder = MovieViewHolder(itemList)
        return holder

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.photo.setImageResource(movies[position].photo)
        holder.name.text = movies[position].name
        holder.description.text = movies[position].description
        holder.seats.text = movies[position].seats
    }

    override fun getItemCount(): Int {
        movies.size

        class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val photo = itemView.findViewById<ImageView>(R.id.photoMovie)
            val name = itemView.findViewById<TextView>(R.id.nameMovie)
            val description = itemView.findViewById<TextView>(R.id.descriptionMovie)
            val seats = itemView.findViewById<TextView>(R.id.seats)

        }
    }
}