package com.example.assessment2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring and connecting variables
        val Startbutton = findViewById<Button>(R.id.Startbtn)


        // listening for button click
        Startbutton.setOnClickListener {
            // creating an explicit intent
            val intent = Intent(this, DogpageActivity::class.java)

            //start the activity
            startActivity(intent)
        }








    }
}