package com.example.movies.ui.activities

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movies.ui.interfaces.IBaseView
import com.example.movies.ui.presenters.BasePresenter

abstract class BaseActivity<P: BasePresenter<IBaseView>> : IBaseView, AppCompatActivity() {
    protected  lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = instantiatePresenter()
    }

    override fun getContext(): Context {
        return this
    }

    /**
     * Instantiates the presenter the Activity is based on.
     */
    protected abstract fun instantiatePresenter(): P
}