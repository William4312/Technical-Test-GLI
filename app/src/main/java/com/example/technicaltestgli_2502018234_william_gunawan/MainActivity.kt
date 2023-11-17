package com.example.technicaltestgli_2502018234_william_gunawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.Loginbutton)
        loginButton.setOnClickListener{
            val intent = Intent(this, ContactList::class.java)
            startActivity(intent)
        }
    }
}