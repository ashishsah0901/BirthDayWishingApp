package com.example.birthdaygreetingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayCard : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        val name = intent.getStringExtra(NAME_EXTRA)
        val view = findViewById<TextView>(R.id.textView3)
        view.text = "Happy Birthday\n $name!"
    }
}