package com.example.hilt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.R
import com.example.hilt.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
internal class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        mainViewModel.log("Using MainViewModel on onStart of the MainActivity")
    }
}