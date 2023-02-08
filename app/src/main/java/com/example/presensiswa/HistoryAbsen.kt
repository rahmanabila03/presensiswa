package com.example.presensiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.presensiswa.room.Note
import com.example.presensiswa.room.NoteDB
import kotlinx.android.synthetic.main.activity_absen.*
import kotlinx.android.synthetic.main.activity_history_absen.*
import kotlinx.android.synthetic.main.activity_login.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HistoryAbsen : AppCompatActivity() {

    val db by lazy { NoteDB(this) }
    lateinit var adapter: adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_absen)
        setupRecycleView()
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val notes = db.noteDao().getNotes()
            Log.d("HisoryAbsen", "dbResponse:$notes")
            withContext(Dispatchers.Main) {
                adapter.setData( notes )
            }
        }
    }

    private fun setupRecycleView(){
        adapter = adapter (arrayListOf())
        list_note.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = adapter
        }
    }
}