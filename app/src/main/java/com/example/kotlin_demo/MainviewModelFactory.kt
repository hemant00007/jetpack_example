package com.example.kotlin_demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainviewModelFactory(var name:String):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
     return MainViewModel(name) as T
    }

}