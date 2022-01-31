package com.example.kotlin_demo

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
     var count:Int =1

    fun increase(){
        count++
    }
}