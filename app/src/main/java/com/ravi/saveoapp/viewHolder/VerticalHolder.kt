package com.ravi.saveoapp.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ravi.saveoapp.interfaces.ClickListener
import com.ravi.saveoapp.modelhorizontal.ImageClasss
import kotlinx.android.synthetic.main.vertical_item.view.*

class VerticalHolder(private val view: View, private val clickListener: ClickListener) :
    RecyclerView.ViewHolder(view) {

    // set the incoming data on each view of our recyclerview
    fun setData(imageClasss: ImageClasss) {
        view.apply {
            Glide.with(showImage2).load(imageClasss.original).into(showImage2)
        }
        view.setOnClickListener {
            clickListener.onClick(adapterPosition)
        }
    }
}