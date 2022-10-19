package com.example.group14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var loginBtn = findViewById<Button>(R.id.LoginBtn)
        loginBtn.setOnClickListener {
            Toast.makeText(this, "You logged in", Toast.LENGTH_LONG).show()
        }
    }
}