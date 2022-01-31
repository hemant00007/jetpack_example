package com.example.kotlin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var txtcount:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtcount = findViewById(R.id.txtconter)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        settext()

    }
    fun settext(){
        txtcount.text =viewModel.count.toString()
    }
    fun increment(v:View)
    {
      viewModel.increase()
        settext()
    }
}