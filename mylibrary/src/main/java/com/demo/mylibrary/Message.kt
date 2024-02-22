package com.demo.mylibrary

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

@Composable
fun showMessage(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}
