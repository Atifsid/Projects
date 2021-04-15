package com.example.hey

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hello.*

class hello : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val name = intent.getStringExtra(NAME_EXTRA)
        bithdayGreeting.text = "Happy Birthday\n$name!"
    }
}