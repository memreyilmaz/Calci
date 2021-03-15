package com.example.calci

import com.example.calci.viewModel.CalciViewModel
import org.koin.dsl.module
import org.koin.android.viewmodel.dsl.viewModel

val viewModelModule = module {
    viewModel { CalciViewModel() }
}