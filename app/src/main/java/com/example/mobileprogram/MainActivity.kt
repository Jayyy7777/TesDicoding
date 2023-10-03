package com.example.mobileprogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mobileprogram.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_switch: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_switch = findViewById(R.id.btn_switch)
        btn_switch.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_switch -> {
                val move = Intent (this@MainActivity, activity_move::class.java)
                startActivity(move)
            }
        }
    }
}