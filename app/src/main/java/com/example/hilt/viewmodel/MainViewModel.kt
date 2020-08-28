package com.example.hilt.viewmodel

import timber.log.Timber
import javax.inject.Inject

interface MainViewModel {

    fun log(star: String)
}

internal class MainViewModelImpl @Inject constructor() : MainViewModel {

    override fun log(str: String) {
        Timber.i(str)
    }
}