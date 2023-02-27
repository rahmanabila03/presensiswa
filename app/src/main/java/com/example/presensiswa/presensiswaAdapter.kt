package com.example.presensiswa

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.presensiswa.room.Note
import kotlinx.android.synthetic.main.activity_absen.view.*
import kotlinx.android.synthetic.main.activity_history_absen.view.*
import kotlinx.android.synthetic.main.adapter_presensiswa.view.*

class presensiswaAdapter (private val notes: ArrayList<Note>) : RecyclerView.Adapter<presensiswaAdapter.NoteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_presensiswa, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.view.txt_namasiswaadapter.text = note.nama
    }

    override fun getItemCount() = notes.size

    class NoteViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<Note>) {
        notes.clear()
        notes.addAll(list)
        notifyDataSetChanged()
    }
}
