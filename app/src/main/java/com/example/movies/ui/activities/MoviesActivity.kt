package com.example.movies.ui.activities

import android.os.Bundle
import com.example.movies.ui.presenters.MoviesPresenter

class MoviesActivity : BaseActivity<MoviesPresenter>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun instantiatePresenter(): MoviesPresenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}