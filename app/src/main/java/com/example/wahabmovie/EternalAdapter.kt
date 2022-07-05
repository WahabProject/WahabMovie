package com.example.wahabmovie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class EternalAdapter (private val context: Context, private val eternal : List<Eternal>, val listener: (Eternal) -> Unit)
    : RecyclerView.Adapter<EternalAdapter.EternalViewHolder>(){

    class EternalViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgEternal = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameEternal = view.findViewById<TextView>(R.id.tv_item_name)
        val descEternal = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(eternal: Eternal, listener: (Eternal) -> Unit){
            imgEternal.setImageResource(eternal.imgEternal)
            nameEternal.text = eternal.nameEternal
            descEternal.text = eternal.descEternal
            itemView.setOnClickListener{
                listener(eternal)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EternalViewHolder {
        return EternalViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_eternal, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EternalViewHolder, position: Int) {
        holder.bindView(eternal[position], listener)
    }

    override fun getItemCount(): Int = eternal.size
}
