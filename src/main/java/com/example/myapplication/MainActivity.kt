package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


enum class CalcMode {
    None, Add, Substract, Multiply
}


class MainActivity : AppCompatActivity() {

//    private val mode = CalcMode.Substract

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        b_1.setOnClickListener { updateTextView(1) }
        b_2.setOnClickListener { updateTextView(2) }
        b_3.setOnClickListener { updateTextView(3) }
//        b_3.setOnClickListener { updateTextView(3) }

    }

    fun updateTextView(num: Int) {
        tV_one.text = "$num"
    }

}