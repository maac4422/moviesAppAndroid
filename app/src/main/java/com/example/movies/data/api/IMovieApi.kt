package com.example.movies.data.api

import com.example.movies.data.entities.MovieApi
import io.reactivex.Observable
import retrofit2.http.GET


interface IMovieApi {

    /**
     * Get the list of the movies from the API
     */
    @GET("/discover/movie")
    fun getMovies(): Observable<List<MovieApi>>
}