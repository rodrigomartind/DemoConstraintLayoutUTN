package com.androidutnba.democonstraintlayoututn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.demo1).setOnClickListener {
            startActivity(Intent(this, Demo1::class.java))
        }

        findViewById<Button>(R.id.demo2).setOnClickListener {
            startActivity(Intent(this, Demo2::class.java))
        }

        findViewById<Button>(R.id.demo3).setOnClickListener {
            startActivity(Intent(this, Demo3::class.java))
        }

        findViewById<Button>(R.id.demo4).setOnClickListener {
            startActivity(Intent(this, Demo4::class.java))
        }
    }
}