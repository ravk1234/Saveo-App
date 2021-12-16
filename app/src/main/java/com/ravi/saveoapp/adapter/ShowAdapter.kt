package com.ravi.saveoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ravi.saveoapp.R
import com.ravi.saveoapp.modelClass.ResponseClass
import com.ravi.saveoapp.viewHolder.ShowHolder

//adapter class which holds the data
class ShowAdapter(
    private var showList: List<ResponseClass>,
) :
    RecyclerView.Adapter<ShowHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ShowHolder(view)
    }

    override fun onBindViewHolder(holder: ShowHolder, position: Int) {
        val showLists = showList[position].show!!
        holder.setData(showLists)
    }

    override fun getItemCount(): Int {
        return showList.size
    }

    // notifies the adapter everytime new data is received

    fun updateData(showList: List<ResponseClass>) {
        this.showList = showList
        notifyDataSetChanged()
    }
}