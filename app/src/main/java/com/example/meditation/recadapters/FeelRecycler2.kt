package com.example.meditation.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meditation.R


class FeelRecycler2(val context: Context, val list: ArrayList<feel2>) :
    RecyclerView.Adapter<FeelRecycler2.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler2.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter2, parent, false)
        return MyVH(root)
    }

    class MyVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.image2)
        val titleView: TextView = itemView.findViewById(R.id.text_title)
        val descriptView: TextView = itemView.findViewById(R.id.text_description)
    }

    override fun onBindViewHolder(holder: FeelRecycler2.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.titleView.setText(list[position].title_feel)
        holder.descriptView.setText(list[position].descript_feel)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}