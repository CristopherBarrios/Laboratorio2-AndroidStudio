package com.example.labo2cristopherbarrios


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var lista = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lista.add("5")
        lista.add("6")
        lista.add("13")
        lista.add("25")
        lista.add("9")

        val listView = findViewById<ListView>(R.id.listata)
        listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista)
    }
    fun ventana(view: View) {
        val hola = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(hola)
        Toast.makeText(this,"Bienvenido",Toast.LENGTH_LONG).show()
    }
    fun ventana2(view: View) {
        Toast.makeText(this,"Se eliminó el historial",Toast.LENGTH_LONG).show()
    }
    
    
}
