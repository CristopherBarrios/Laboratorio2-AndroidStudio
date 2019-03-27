package com.example.labo2cristopherbarrios

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button(view: View) {
        val hola = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(hola)
    }
}
