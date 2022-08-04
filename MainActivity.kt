package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txt_number : TextView = findViewById(R.id.rolltext)
        val btnroll : Button = findViewById(R.id.butroll)

        btnroll.setOnClickListener {

            // declare variable for toast
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)

            // function for show toast
            toast.show()
        }

    }

}