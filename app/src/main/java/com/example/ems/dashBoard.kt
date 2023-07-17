package com.example.ems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class dashBoard : AppCompatActivity() {
    private lateinit var btnnext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        btnnext=findViewById(R.id.next)


        btnnext.setOnClickListener {
            val intent = Intent(this, universities::class.java)
            startActivity(intent)
        }
    }
}