package com.sekreative.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Interface{

    override var myVar: String = "Worked!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateButton.setOnClickListener { welcomeTextView.text = "Kotlin is so Easy!" }

        hello()
    }

    override fun hello() {
        updateButton2.setOnClickListener { welcomeTextView.text = "Interface " + myVar}
    }
}

