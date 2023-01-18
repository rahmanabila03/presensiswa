package com.example.presensiswa.room

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    fun addNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query("SELECT * FROM note")
    fun getNotes(note: Note): List<Note>
}