package com.example.bin_go

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class inicio : AppCompatActivity() {

    var act = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        act = 0
    }

    override fun onResume() {
        super.onResume()
        act = 0
    }

    fun plei(view: View){
        if(act == 0){
            val i : Intent = Intent(this, MainActivity::class.java)
            act = 1
            startActivity(i)
        }
    }

    fun howto(view : View){
        if(act == 0){
            val i : Intent = Intent(this, MainActivity::class.java)
            act = 1
            startActivity(i)
        }
    }
}