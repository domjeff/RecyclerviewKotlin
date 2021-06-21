package com.example.recyclerviewkotlin

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.data.Recording
import java.time.format.DateTimeFormatter

class RecyclerViewAdapter(
    private val recordingList: ArrayList<Recording>
) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    class RecyclerViewViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tvTitle)
        val subtitle: TextView = itemView.findViewById(R.id.tvSubtitle)
        val launchingDate: TextView = itemView.findViewById(R.id.tvLaunchingDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.card_recording_layout,
            parent,
            false
        )

        return RecyclerViewViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val currentItem = recordingList[position]

        holder.title.text = currentItem.title
        holder.subtitle.text = currentItem.subtitle
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            holder.launchingDate.text = currentItem.date?.format(
//                DateTimeFormatter.ofPattern("dd-MM-yyyy")
//            )
//        } else {
//            holder.launchingDate.text = Build.VERSION.SDK_INT.toString()
//        }
        holder.launchingDate.text = currentItem.date

    }

    override fun getItemCount(): Int {
        return recordingList.size
    }
}