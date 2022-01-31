package com.example.kotlin_demo

import androidx.lifecycle.ViewModel

class MainViewModel(var initialvalue:String) : ViewModel() {
     var myname:String =initialvalue

    fun increase(){
        myname
    }
}