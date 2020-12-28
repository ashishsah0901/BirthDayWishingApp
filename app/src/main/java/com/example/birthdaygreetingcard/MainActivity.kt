package com.example.birthdaygreetingcard

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    fun createBdayCard(view: View) {
        val edit = findViewById<EditText>(R.id.edittext)
        val name = edit.editableText.toString()
        val intent = Intent(this,BirthdayCard::class.java)
        intent.putExtra(BirthdayCard.NAME_EXTRA,name)
        startActivity(intent)
    }
}