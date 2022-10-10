package com.example.myappvnt.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myappvnt.R
import com.example.myappvnt.ui.recyclerview.adapter.ApplicationsListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfApplications = findViewById<RecyclerView>(R.id.applications_list_recycle_view)
        listOfApplications.adapter = ApplicationsListAdapter()
    }

}