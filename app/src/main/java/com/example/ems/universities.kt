package com.example.ems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class universities : AppCompatActivity() {
    private lateinit var anna:ImageView
    private lateinit var college1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universities)

        anna=findViewById(R.id.anna)
        college1=findViewById(R.id.annauni)

        anna.setOnClickListener{
            val intent= Intent(this,college::class.java)
            startActivity(intent)
        }


    }
}