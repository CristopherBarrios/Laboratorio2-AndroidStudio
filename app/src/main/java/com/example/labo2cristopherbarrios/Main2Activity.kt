package com.example.labo2cristopherbarrios


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {


    private var button3: Button? = null
    private var textView: TextView? = null
    private var contador: Int= 0

    var lista = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button3 = findViewById(R.id.button3) as Button
        button3!!.setOnClickListener(this)
        textView = findViewById(R.id.textView) as TextView
        val listView = findViewById<ListView>(R.id.listView)


        listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista)
    }
    override fun onClick(v: View?) {
        if(contador>=0){
            contador++
            textView?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()

        }
    }
     fun onClick2(v: View?) {
        if(contador>0){
            contador--
            textView?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()
        }
    }
    fun onClick3(v: View?) {
        contador = 0
        textView?.setText(Integer.toString(contador))
    }
    fun  onClick4(v: View?) {
        lista.add(Integer.toString(contador))
        listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista)
        Toast.makeText(this,"Se ha agregado", Toast.LENGTH_LONG).show()
    }
}



