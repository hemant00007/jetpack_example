package com.example.kotlin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var txtcount:TextView
    lateinit var edtname:EditText
    lateinit var send :Button
    lateinit var username:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtcount = findViewById(R.id.txtconter)
        edtname = findViewById(R.id.edt_name)
        send = findViewById(R.id.btn_send)

        send.setOnClickListener{
             username= edtname.text.toString();
            viewModel = ViewModelProvider(this,MainviewModelFactory(username)).get(MainViewModel::class.java)
            settext()
            Toast.makeText(this,viewModel.myname,Toast.LENGTH_LONG).show()
            
        }




    }
    fun settext(){
        txtcount.text =viewModel.myname
    }
    fun increment(v:View)
    {
      viewModel.increase()
        settext()
        Toast.makeText(this,viewModel.myname,Toast.LENGTH_LONG).show()
    }
}