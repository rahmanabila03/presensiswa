package com.example.presensiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
    }

    fun absen (view: View){
        val itu = Intent (this,absen ::class.java)
        startActivity(itu)
    }
}