package com.example.recycle.MyData

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recycle.R

class ActivityAdapter(var context: Context, var list: ArrayList<Activities>):RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    class ActivityViewHolder(itemView: View): ViewHolder(itemView) {
        var images = itemView.findViewById<ImageView>(R.id.image)
        var names = itemView.findViewById<TextView>(R.id.activity)
        var times = itemView.findViewById<TextView>(R.id.time)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.newlayout,null,false)
        return ActivityViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.images.setImageResource(list[position].image)
        holder.names.text = list[position].activityName
        holder.times.text = list[position].activityTime
    }

}