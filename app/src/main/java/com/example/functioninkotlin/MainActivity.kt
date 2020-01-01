package com.example.functioninkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test();
    }
    fun test()
    {
        val x=5*4
        println(x);
    }
    fun change(view: View)
    {
        val x1=5
        textView.text=x1.toString()
    }
    fun makeSimpson(view: View){

        var homer=Simpson(nameText.text.toString(),Integer.parseInt(ageText.text.toString()),jobText.text.toString())
        textView.text="Name: "+homer.name+"\n Age: "+homer.age+"\n Job:  "+homer.job


    }
}
