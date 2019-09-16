package com.example.movies.ui.presenters

import com.example.movies.data.entities.MovieApi
import com.example.movies.ui.interfaces.IMoviesView
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class MoviesPresenter(moviesView: IMoviesView) : BasePresenter<IMoviesView>(moviesView) {
    @Inject
    lateinit var movieApi: MovieApi

    private var subscription: Disposable? = null

    override fun onViewCreated() {
        loadMovies()
    }


    override fun onViewDestroyed() {
        subscription?.dispose()
    }

    fun loadMovies() {
        view.showLoading()
        //subscription = movieApi
    }
}