package com.example.group14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<TextView>(R.id.nextBtn)
        val loginButton = findViewById<TextView>(R.id.loginWithFbBtn)

        nextButton.setOnClickListener {

            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            Toast.makeText(this, "You logged in with Facebook", Toast.LENGTH_SHORT).show()
        }
    }
}