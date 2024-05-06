package com.example.assessment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
// Setting up a listener for the feed button
        feedbutton.setOnClickListener {
            // Logging the event of the feed button being clicked
            Log.d("dogpage", "feeding as started")
            // Restoring the original pet image after a short delay
            dogimagestatus.postDelayed({
                dogimagestatus.setImageResource(R.drawable.homescreen)
            }, 5000)
            // Incrementing the current feeding status value
            val hungerstatus = Hungerstat.text.toString().toInt()
            val latesthungerstat = hungerstatus + 8
            // Logging the updated feeding status value
            Log.d("dogpage", "hunger updated")
            // Updating the displayed feeding status value
            Hungerstat.text = latesthungerstat.toString()
            // Changing the pet's image to reflect feeding activity
            dogimagestatus.setImageResource(R.drawable.dogeating)
        }

// Setting up a listener for the happy button
       playbutton.setOnClickListener {
            // Logging the event of the happy button being clicked
            Log.d("dogpage", "feeding as started")
            // Restoring the original pet image after a short delay
            dogimagestatus.postDelayed({
                dogimagestatus.setImageResource(R.drawable.homescreen)
            }, 5000)
            // Incrementing the current happy status value
            val happystatus = happystat.text.toString().toInt()
            val latesthappystat = happystatus + 8
            // Logging the updated happy status value
            Log.d("dogpage", "happy updated")
            // Updating the displayed happy status value
            happystat.text = latesthappystat.toString()
            // Changing the pet's image to reflect happy activity
            dogimagestatus.setImageResource(R.drawable.dogplaying)
        }
// Setting up a listener for the clean button
        cleanbutton.setOnClickListener {
            // Logging the event of the clean button being clicked
            Log.d("dogpage", "cleaning as started")
            // Restoring the original pet image after a short delay
            dogimagestatus.postDelayed({
                dogimagestatus.setImageResource(R.drawable.homescreen)
            }, 5000)
            // Incrementing the current clean status value
            val cleanstatus = Cleanstat.text.toString().toInt()
            val latestcleanstat = cleanstatus + 8
            // Logging the updated clean status value
            Log.d("dogpage", "clean updated")
            // Updating the displayed clean status value
            Cleanstat.text = latestcleanstat.toString()
            // Changing the pet's image to reflect clean activity
            dogimagestatus.setImageResource(R.drawable.dogcleaning)
        }





    }
}