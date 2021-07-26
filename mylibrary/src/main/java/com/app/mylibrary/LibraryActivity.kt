package com.app.mylibrary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        fun startLibFromCompanion(context: Context) {
            Toast.makeText(context, "TEST LIB", Toast.LENGTH_SHORT).show()
        }

        fun startActivity(context: Context) {
            val intent = Intent(context, LibraryActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun startLib() {
        Toast.makeText(this, "TEST LIB", Toast.LENGTH_SHORT).show()
    }
}