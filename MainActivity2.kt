package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val home = findViewById<Button>(R.id.button18);


        home.setOnClickListener{
            navigateToHomePage()
        }



    }
    private fun navigateToHomePage() {
        // Start a new Activity for the homepage
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
        finish() // Close the login activity so the user can't come back with the back button
    }
}