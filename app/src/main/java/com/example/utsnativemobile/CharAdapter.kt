package com.example.utsnativemobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharAdapter (private val context: Context, private val charre: List<CharRe>, val listener: (CharRe) -> Unit)
    : RecyclerView.Adapter<CharAdapter.CharReViewHolder>() {

    class CharReViewHolder(view : View): RecyclerView.ViewHolder(view) {

        val imgChar = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameChar = view.findViewById<TextView>(R.id.tv_item_name)
        val descChar = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(charre: CharRe, listener: (CharRe) -> Unit){
            imgChar.setImageResource(charre.imgChar)
            nameChar.text = charre.nameChar
            descChar.text = charre.descChar

            itemView.setOnClickListener{
                listener(charre)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharReViewHolder {
        return CharReViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_character, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CharReViewHolder, position: Int) {
       holder.bindView(charre[position], listener)
    }

    override fun getItemCount(): Int = charre.size
    }

