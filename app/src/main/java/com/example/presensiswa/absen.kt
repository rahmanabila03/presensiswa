package com.example.presensiswa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.example.presensiswa.room.Note
import com.example.presensiswa.room.NoteDB
import com.example.presensiswa.room.NoteDao
import kotlinx.android.synthetic.main.activity_absen.*
import kotlinx.android.synthetic.main.adapter_presensiswa.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class absen : AppCompatActivity(){

    val db by lazy { NoteDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absen)
    }
    fun back (view: View){
        val nana = Intent (this,Beranda::class.java)
        startActivity(nana)
    }
    fun centang (view: View){
        val ceklis = Intent (this,tampilanberhasil::class.java)
        startActivity(ceklis)
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.rdbtn_hadir ->
                    if (checked) {
                    }
                R.id.rdbtn_sakit ->
                    if (checked) {
                    }
                R.id.rdbtn_ijin ->
                    if (checked) {
                    }
            }
        }
    }
    }

    class adapter (private val notes: ArrayList<Note>) : RecyclerView.Adapter<adapter.NoteViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate( R.layout.activity_history_absen, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.view.txt_presensiswa.text =  note.nama
    }

    override fun getItemCount() = notes.size

    class NoteViewHolder( val view: View) : RecyclerView.ViewHolder(view)

    @SuppressLint("NotifyDataSetChanged")
    fun  setData(list: List<Note>) {
        notes.clear()
        notes.addAll(list)
        notifyDataSetChanged()
    }





}

