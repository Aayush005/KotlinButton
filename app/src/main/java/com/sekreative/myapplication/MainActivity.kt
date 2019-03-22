package com.sekreative.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateButton.setOnClickListener { welcomeTextView.text = "Kotlin is so Easy!" }

        updateButton2.setOnClickListener(this) // Button using the onClickListener Interface
    }


    override fun onClick(v: View?) {

        when(v?.id){
            R.id.updateButton2 -> welcomeTextView.text = "YES! Very Easy!"
        }
    }
}

