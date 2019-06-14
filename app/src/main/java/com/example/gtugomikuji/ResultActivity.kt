package com.example.gtugomikuji

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val unsei: Array<String> = arrayOf("大凶","凶","吉","小吉","大吉♡","めっちゃ凶","すごい凶","なんとも言えないくらい凶","凶すぎて凶")
//        トーストの場合はコメントの文
//        Toast.makeText(this,unsei.random(), Toast.LENGTH_SHORT).show()
        val result: TextView = findViewById(R.id.result)
        result.text = unsei.random()
        return_button.setOnClickListener{
            finish()
        }
    }



}
