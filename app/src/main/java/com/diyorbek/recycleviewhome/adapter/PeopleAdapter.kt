package com.diyorbek.recycleviewhome.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewhome.R
import com.diyorbek.recycleviewhome.mode.PeopleData

class PeopleAdapter(
    private val peopleList: ArrayList<PeopleData>
):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.sample,parent,false)
        return PeopleViewHoler(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PeopleViewHoler).bind(peopleList[position])
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }
    inner class PeopleViewHoler(private val view: View): RecyclerView.ViewHolder(view){
        fun bind(person: PeopleData){
            val personImage: ImageView = view.findViewById(R.id.personImage)
            val personName: TextView = view.findViewById(R.id.personName)
            val personDecs: TextView = view.findViewById(R.id.personDesc)

            personImage.setImageResource(person.image)
            personName.text = person.name
            personDecs.text = person.desc
        }
    }
}