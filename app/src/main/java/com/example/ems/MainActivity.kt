package com.example.ems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.loginbtn)

        btn.setOnClickListener {
            val intent=Intent(this,Login_Activity::class.java)
            startActivity(intent)
        }
    }
}