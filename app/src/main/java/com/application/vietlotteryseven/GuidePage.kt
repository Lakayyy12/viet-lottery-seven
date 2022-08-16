package com.application.vietlotteryseven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.vietlotteryseven.R

class GuidePage : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Details>

//    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    private lateinit var briefNews : Array<String>

    private var btnS : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)
        heading = arrayOf(
            getString(R.string.g1),
            getString(R.string.g2),
            getString(R.string.g3),
            getString(R.string.g4),
            getString(R.string.g5)
        )
        briefNews = arrayOf(
            getString(R.string.g11),
            getString(R.string.g22),
            getString(R.string.g33),
            getString(R.string.g44),
            getString(R.string.g55)
        )
        newRecyclerView = findViewById(R.id.recyclerItems)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Details>()
        getUserdata()

        btnS = findViewById(R.id.btnS)
        btnS?.setOnClickListener{
            onBackPressed()
        }
    }
    private fun getUserdata() {

        for(i in heading.indices){

            val news = Details(heading[i],briefNews[i])
            newArrayList.add(news)
        }
        val adapter = MyAdapter2(newArrayList)
        newRecyclerView.adapter = adapter
    }
}
