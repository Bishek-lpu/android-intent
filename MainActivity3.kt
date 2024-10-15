package com.example.myapplication

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val rootView: View = findViewById(R.id.main)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener{
            Log.v(TAG,"Hello Hi This is a Log");
            Log.d(TAG,"Debug log: highest ")

//            Log.d -- Debug log
//            Log.i --> info log
//            Log.w --> warning log
//            Log.v --> verbose log

        }

        button2.setOnClickListener{
            showSnackbar(rootView)
        }





    }
    private fun showSnackbar(view: View) {
        val snackbar = Snackbar.make(view, "This is a clickable Snackbar!", Snackbar.LENGTH_LONG)

        // Adding the clickable action
        snackbar.setAction("Go ") {
            // Handle the action (for example, undo an operation)
            Snackbar.make(view, "Undo clicked!", Snackbar.LENGTH_SHORT).show()
        }

        snackbar.show() // Finally show the Snackbar
    }
}