package com.example.hilt.injection

import com.example.hilt.viewmodel.MainViewModel
import com.example.hilt.viewmodel.MainViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
internal abstract class MainModule {

    @Binds
    abstract fun bindMainViewModel(viewModel: MainViewModelImpl): MainViewModel
}
