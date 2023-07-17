package com.example.ems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sign

class Login_Activity : AppCompatActivity() {
    lateinit var user:EditText
    private lateinit var pass:EditText
    private lateinit var btnlogin:Button
    lateinit var btnsignin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        user=findViewById (R.id.user)
        pass=findViewById(R.id.pwd)
        btnlogin=findViewById(R.id.lob)
        btnsignin=findViewById(R.id.signin)


        btnlogin.setOnClickListener {
            login()
        }
        btnlogin.setOnClickListener {
            val intent1=Intent(this,dashBoard::class.java)
            startActivity(intent1)
        }
        btnsignin.setOnClickListener {
            val intent= Intent(this, Sign_Activity::class.java)
            startActivity(intent)
        }

    }

    private fun login() {
        val user = user.text.toString()
        val pass = pass.text.toString()
    }
}