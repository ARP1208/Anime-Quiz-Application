package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart: Button = findViewById(R.id.buttonStart)
        val editText_Name: EditText = findViewById(R.id.editText_Name)
        buttonStart.setOnClickListener {
            if (editText_Name.text.isEmpty()) {
                Toast.makeText(this, "Please enter your Name to continue!", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuizAppQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editText_Name.text.toString())
                startActivity(intent)
                finish()
            }

        }
    }
}
