package com.androidatc.cp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }
    fun help(view: View) {
        var intent = Intent(this, Help::class.java)
        startActivity(intent)
    }

    fun home(view: View){
        onBackPressed()
    }
}