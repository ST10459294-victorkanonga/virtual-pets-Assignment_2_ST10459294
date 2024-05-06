package com.example.assessment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DogpageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dogpage)

        // Declaring and connecting variables
        val feedbutton = findViewById<Button>(R.id.feedbutton)
        val cleanbutton = findViewById<Button>(R.id.cleanbutton)
        val playbutton = findViewById<Button>(R.id.playbutton)
        val Hungerstat = findViewById<TextView>(R.id.hungerstat)
        val Cleanstat = findViewById<TextView>(R.id.cleanstat)
        val happystat = findViewById<TextView>(R.id.happystat)
        val dogimagestatus = findViewById<ImageView>(R.id.dogimagestatus)






    }
}