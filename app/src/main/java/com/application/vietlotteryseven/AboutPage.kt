package com.application.vietlotteryseven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AboutPage : AppCompatActivity() {

    private var btnB : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        btnB = findViewById(R.id.btnB)
        btnB?.setOnClickListener{
            onBackPressed()
        }
    }
}