package com.example.movies.ui.presenters

import com.example.movies.ui.di.ContextModule
import com.example.movies.ui.di.DaggerIPresenterInjector
import com.example.movies.ui.di.IPresenterInjector
import com.example.movies.ui.di.NetworkModule
import com.example.movies.ui.interfaces.IBaseView

abstract class BasePresenter<out V : IBaseView>(protected val view: V) {

    private val injector: IPresenterInjector = DaggerIPresenterInjector
        .builder()
        .baseView(view)
        .contextModule(ContextModule)
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }


    /**
     * This method may be called when the presenter view is created
     */
    open fun onViewCreated(){}

    /**
     * This method may be called when the presenter view is destroyed
     */
    open fun onViewDestroyed(){}

    private fun inject() {
        when(this) {
            is MoviesPresenter -> injector.inject(this)
        }
    }
}