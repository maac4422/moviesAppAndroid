package com.example.movies.ui.interfaces

import com.example.movies.domain.entities.Movie

interface IMoviesView : IBaseView {

    fun updateMovies(movies: List<Movie>)
    fun showLoading()
    fun hideLoading()
}