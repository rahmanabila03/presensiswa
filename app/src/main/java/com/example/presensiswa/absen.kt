package com.example.presensiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class absen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absen)
    }
    fun back (view: View){
        val nana = Intent (this,Beranda::class.java)
        startActivity(nana)
    }
}