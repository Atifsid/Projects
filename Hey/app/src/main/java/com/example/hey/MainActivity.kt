package com.example.hey

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {

        val intent = Intent(this, hello::class.java)
        val name = nameInput.editableText.toString()
        intent.putExtra(hello.NAME_EXTRA,name)
        startActivity(intent)

    }
}