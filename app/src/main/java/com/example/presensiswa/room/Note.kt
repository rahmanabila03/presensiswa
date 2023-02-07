package com.example.presensiswa.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id") val id: Int,
    @ColumnInfo("nama") val nama: String,
    @ColumnInfo("kelas") val kelas: String,
    @ColumnInfo("nisn") val nisn: Int
)