package com.example.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    private val isDebug = BuildConfig.DEBUG

    override fun onCreate() {
        super.onCreate()

        startTimber(isDebug)
    }

    private fun startTimber(isDebug: Boolean) {
        if (isDebug) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
