package com.tsci.mvpsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity(), IView {

    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = Presenter(this)

        findViewById<AppCompatButton>(R.id.buttonGetName)
            .setOnClickListener {
                presenter.setRandomName()
            }
    }

    override fun setName(name: String) {
        findViewById<TextView>(R.id.textViewName)
            .text = name
    }
}