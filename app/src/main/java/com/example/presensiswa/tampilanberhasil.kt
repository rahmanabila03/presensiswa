package com.example.presensiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class tampilanberhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilanberhasil)

        Handler().postDelayed({
            val intent = Intent (this,Beranda::class.java)
            startActivity(intent)
            finish()
        },3000
        )
    }
}