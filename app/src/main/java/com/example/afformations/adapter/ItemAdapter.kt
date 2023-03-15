package com.example.afformations.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.afformations.R
import com.example.afformations.model.Affirmation

class ItemAdapter(private val dataset: List<Affirmation>, private val context: Context): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()  {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView= view.findViewById(R.id.item_tittle)
    }

    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent, false) //t contient désormais une référence à la vue de l'élément de liste
        return ItemViewHolder(adapterLayout)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

}