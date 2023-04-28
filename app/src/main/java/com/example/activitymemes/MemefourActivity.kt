package com.example.activitymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemefourActivity : AppCompatActivity() {
    lateinit var btnNext5:Button
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour)
        btnNext5= findViewById(R.id.btnNext5)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNext5.setOnClickListener {
            val intent = Intent(this,MemefiveActivity::class.java)
            startActivity(intent)
        }
        btnPrevious.setOnClickListener {
            val intent = Intent(this,MemethreeActivity::class.java)
            startActivity(intent)
        }
    }
}