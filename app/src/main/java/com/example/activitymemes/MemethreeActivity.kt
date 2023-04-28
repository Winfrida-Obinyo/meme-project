package com.example.activitymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemethreeActivity : AppCompatActivity() {
    lateinit var btnNext4:Button
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        btnNext4 =findViewById(R.id.btnNext4)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNext4.setOnClickListener {
            val intent = Intent(this,MemefourActivity::class.java)
            startActivity(intent)

            }
        btnPrevious.setOnClickListener {
            val intent = Intent(this,MemetwoActivity::class.java)
            startActivity(intent)
        }
    }
}

