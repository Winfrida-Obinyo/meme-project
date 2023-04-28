package com.example.activitymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemefiveActivity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefive)
        btnPrevious=findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent = Intent(this,MemefourActivity::class.java)
            startActivity(intent)
        }
    }
}
