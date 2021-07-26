package com.app.mylibrary

import android.content.Context
import android.widget.Toast

object ObjectClass {
    fun showToast(context: Context) {
        Toast.makeText(context, "TEST LIB", Toast.LENGTH_SHORT).show()
    }
}