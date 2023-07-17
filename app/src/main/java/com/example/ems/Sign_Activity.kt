package com.example.ems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Sign_Activity : AppCompatActivity() {
    private lateinit var uname:EditText
    private lateinit var umail:EditText
    private lateinit var upassword:EditText
    private lateinit var usign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        uname=findViewById(R.id.user)
        umail=findViewById(R.id.email)
        upassword=findViewById(R.id.pwd)
        usign=findViewById(R.id.log)

        usign.setOnClickListener {
            sign()
        }
        usign.setOnClickListener {
            val intent=Intent(this,dashBoard::class.java)
            startActivity(intent)
        }

    }

    private fun sign() {
        val user_name=uname.toString()
        val user_email=umail.toString()
        val user_pass=upassword.toString()

    }
}