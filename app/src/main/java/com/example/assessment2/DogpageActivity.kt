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


// Defining a Runnable to decrement the boredom value periodically
        val decreasehappyRunnable = object : Runnable {
            override fun run() {
                // Indicating the start of the countdown for decreasing happy
                Log.d("LivePet", "Starting countdown to reduce happy")
                // Retrieving the current happy value from the TextView
                val currenthappyValue = happystat.text.toString().toInt()
                // Decreasing the happy value by 5 units
                val newhappyValue = currenthappyValue - 3
                // Logging the decrease in the happiness stat
                Log.d("LivePet", "Decreased happiness by 5 units")
                // Updating the TextView with the new boredom value
                happystat.text = newhappyValue.toString()
                // Scheduling the next execution of this Runnable after 3.2 seconds
               happystat.postDelayed(this, 3200)
            }
        }

// Initiating the continuous decrease of boredom value
        happystat.post(decreasehappyRunnable)


        // Defining a Runnable to decrement the boredom value periodically
        val decreasecleanRunnable = object : Runnable {
            override fun run() {
                // Indicating the start of the countdown for decreasing clean
                Log.d("LivePet", "Starting countdown to reduce clean")
                // Retrieving the current happy value from the TextView
                val currentcleanValue = Cleanstat.text.toString().toInt()
                // Decreasing the clean value by 5 units
                val newcleanValue = currentcleanValue - 3
                // Logging the decrease in the clean stat
                Log.d("LivePet", "Decreased clean by 5 units")
                // Updating the TextView with the new clean value
                Cleanstat.text = newcleanValue.toString()
                // Scheduling the next execution of this Runnable after 3.2 seconds
                Cleanstat.postDelayed(this, 3200)
            }
        }

// Initiating the continuous decrease of boredom value
        Cleanstat.post(decreasecleanRunnable)


        // Defining a Runnable to decrement the feed value periodically
        val decreasehungerRunnable = object : Runnable {
            override fun run() {
                // Indicating the start of the countdown for decreasing hunger
                Log.d("LivePet", "Starting countdown to reduce hunger")
                // Retrieving the current hunger value from the TextView
                val currenthungerValue = Hungerstat.text.toString().toInt()
                // Decreasing the hunger value by 5 units
                val newhungerValue = currenthungerValue - 3
                // Logging the decrease in the clean stat
                Log.d("LivePet", "Decreased hunger by 5 units")
                // Updating the TextView with the new hunger value
                Hungerstat.text = newhungerValue.toString()
                // Scheduling the next execution of this Runnable after 3.2 seconds
                Hungerstat.postDelayed(this, 3200)
            }
        }

// Initiating the continuous decrease of boredom value
        Hungerstat.post(decreasehungerRunnable)


    }
}
