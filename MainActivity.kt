package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

//App Localization

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button1 = findViewById<ImageButton>(R.id.imageButton1)
        val button2 = findViewById<ImageButton>(R.id.imageButton2)
        val button3 = findViewById<ImageButton>(R.id.imageButton3)
        val button4 = findViewById<ImageButton>(R.id.imageButton4)
        val button5 = findViewById<ImageButton>(R.id.imageButton5)
        val button6 = findViewById<ImageButton>(R.id.imageButton6)


        button1.setOnClickListener {
            navigateToHomePage()
            // Do something when the button is clicked
//            Toast.makeText(this, "ImageButton clicked!", Toast.LENGTH_SHORT).show()
            Snackbar.make(it, "ImageButton clicked!", Snackbar.LENGTH_SHORT).show()
        }



        button2.setOnClickListener {
            navigateToHomePage()
            // Do something when the button is clicked
//            Toast.makeText(this, "ImageButton clicked!", Toast.LENGTH_SHORT).show()
            Snackbar.make(it, "ImageButton clicked!", Snackbar.LENGTH_SHORT).show()
        }


        button3.setOnClickListener {
            // Do something when the button is clicked
            Toast.makeText(this, "ImageButton clicked!", Toast.LENGTH_SHORT).show()
        }


        button4.setOnClickListener {
            // Do something when the button is clicked
            Toast.makeText(this, "ImageButton clicked!", Toast.LENGTH_SHORT).show()
        }


        button5.setOnClickListener {
            // Do something when the button is clicked
            Toast.makeText(this, "ImageButton clicked!", Toast.LENGTH_SHORT).show()
            navigateToHomePage()
        }

        button6.setOnClickListener {
            // Do something when the button is clicked
            Toast.makeText(this, "ImageButton clicked!", Toast.LENGTH_SHORT).show()
            navigateToHomePage()
        }













        }
    private fun navigateToHomePage() {
        // Start a new Activity for the homepage
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        finish() // Close the login activity so the user can't come back with the back button
    }
    }
