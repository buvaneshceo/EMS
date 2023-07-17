package com.example.ems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class college : AppCompatActivity() {
    private lateinit var next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_college)


        next=findViewById(R.id.next1)


        next.setOnClickListener {
            val intent=Intent(this,Chat::class.java)
            startActivity(intent)
        }

        val collegenames= arrayOf("Jeppiaar Institute Of Technology", "College of Engineering",
            "Madras Institute of Technology" , "Government College of Technology",
            "PSG College of Technology",
            "Thiagarajar College of Engineering",
            "Sri Sivasubramaniya Nadar College of Engineering",
            "Coimbatore Institute of Technology",
            "Kongu Engineering College" ,
            "SSN College of Engineering",
            "Velammal Engineering College")
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, collegenames)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(applicationContext,
                        "" + collegenames[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>){
                    //write a some action future

                }                }



        }


    }}



