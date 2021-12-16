package com.ravi.saveoapp.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ravi.saveoapp.modelClass.ShowClass
import kotlinx.android.synthetic.main.item_layout.view.*

class ShowHolder(private val view: View) :
    RecyclerView.ViewHolder(view) {

    // set the incoming data on each view of our recyclerview

    fun setData(showClass: ShowClass) {
        view.apply {
            Glide.with(showImage).load(showClass.image!!.original).into(showImage)
        }
    }
}