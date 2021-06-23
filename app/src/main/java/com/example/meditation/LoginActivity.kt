package com.example.meditation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {
            val input_email = findViewById<EditText>(R.id.editText_email)
            val input_password = findViewById<EditText>(R.id.editText_password)

            val isNotEmptyEmail = input_email.text.toString().isNotEmpty()
            val isNotEmptyPassword = input_password.text.toString().isNotEmpty()

            if(isNotEmptyEmail && isNotEmptyPassword){
                val intent = Intent(this, MainScreen::class.java)
                startActivity(intent)
            }else{
                AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("У вас есть незаполненые поля")
                    .setPositiveButton("Ок", null)
                    .create()
                    .show()
            }
        }
    }
}