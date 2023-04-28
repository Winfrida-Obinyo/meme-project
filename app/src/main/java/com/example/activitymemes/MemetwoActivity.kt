package com.example.activitymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemetwoActivity : AppCompatActivity() {
    private lateinit var btnNext2: Button
    private lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memetwo)
        btnNext2 = findViewById(R.id. btnNext2)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNext2.setOnClickListener {
            val intent = Intent(this,MemethreeActivity::class.java)
            startActivity(intent)

            }
        btnPrevious.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}