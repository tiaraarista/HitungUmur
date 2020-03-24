package com.tiaraarista.hitungumur

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            val TahunLahir = etTahunLahir.text.toString()
            val Tahun:Int = Calendar.getInstance().get(Calendar.YEAR)
            var Umur = 0
            if (TahunLahir.toIntOrNull() !=null){
                var Umur = Tahun - TahunLahir.toInt()
                tvUmur.text = "Umur anda $Umur tahun"
            }else{
                tvUmur.text = "Tahun tidak valid"
            }
        }
    }
    @Override
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    fun onAbout(mi: MenuItem?) {
        val intent = Intent(this@MainActivity, About::class.java)
        startActivity(intent)
    }
}
