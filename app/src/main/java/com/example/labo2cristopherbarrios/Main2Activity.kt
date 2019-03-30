package com.example.labo2cristopherbarrios

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var  contador= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun suma(view: View) {
        contador++
        val txt = findViewById(R.id.textView) as TextView
        txt.setText(contador)
    }
    fun resta(view: View) {
        contador--
        val txt = findViewById(R.id.textView) as TextView
        txt.setText(contador)
    }

}
