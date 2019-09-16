package com.example.movies.ui.di

import com.example.movies.ui.interfaces.IBaseView
import com.example.movies.ui.presenters.MoviesPresenter
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface IPresenterInjector {
    /**
     * Injects required dependencies into the specified PostPresenter.
     * @param moviesPresenter MoviesPresenter in which to inject the dependencies
     */
    fun inject(moviesPresenter: MoviesPresenter)

    @Component.Builder
    interface  Builder {
        fun build() : IPresenterInjector

        fun networkModule(networkModule: NetworkModule) : Builder
        fun contextModule(contextModule: ContextModule) : Builder

        @BindsInstance
        fun  baseView(baseView: IBaseView): Builder
    }
}