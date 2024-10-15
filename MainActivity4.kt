package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)


        val url = findViewById<Button>(R.id.button3)

        val navigate = findViewById<Button>(R.id.button4)

        var camera = findViewById<Button>(R.id.button5)

        var call = findViewById<Button>(R.id.button6)




        url.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.python.org")
            startActivity(intent)
        }


        navigate.setOnClickListener{
            navigateToHomePage()

        }


        camera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        call.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:+199874561230"))
            startActivity(intent)

        }
















    }
    private fun navigateToHomePage() {
        // Start a new Activity for the homepage
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        finish() // Close the login activity so the user can't come back with the back button
    }

}
