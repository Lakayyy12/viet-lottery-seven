package com.application.vietlotteryseven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var exit = 0

    private var tv1 : TextView? = null
    private var tv2 : TextView? = null

    private var btn1 : TextView? = null
    private var btn2 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        tv1?.setOnClickListener{
         val intent = Intent(this, GuidePage::class.java)
            startActivity(intent)
        }
        tv2 = findViewById(R.id.tv2)
        tv2?.setOnClickListener{
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.bt))
        }
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.bt2))
        }

















    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "BẤM ĐÔI ĐỂ Thoát", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}