package com.example.myappvnt.ui.recyclerview.adapter

import android.app.Application
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myappvnt.models.ModelApplication

class ApplicationsListAdapter (
    private val applications: List<ModelApplication>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return applications.size
    }

}
