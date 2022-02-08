package com.example.lotterrynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker

class MainActivity : AppCompatActivity() {
    private val clearButton: Button by lazy{
        findViewById<Button>(R.id.clearButton)
    }
    private val addButton: Button by lazy{
        findViewById<Button>(R.id.addButton)
    }
    private val runButton: Button by lazy{
        findViewById<Button>(R.id.runButton)
    }

    private val numberPicker:NumberPicker by lazy{
        findViewById<NumberPicker>(R.id.numberPicker)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberPicker.minValue = 1
        numberPicker.maxValue = 45

        initRunButton()
    }
    private fun initRunButton(){
        runButton.setOnClickListener{
            val list = getRandomNumber()
        }
    }
    private fun getRandomNumber(): List<Int>{
        val numberList = mutableListOf<Int>().apply{
            for(i in 1..45){
                this.add(i)
            }
        }
        numberList.shuffle()

        return numberList.subList(0,6)
    }
}