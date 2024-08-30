package com.example.belajarandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSubmit: Button = findViewById(R.id.main_btn_submit)
        val etNama : EditText = findViewById(R.id.main_et_nama)

        btnSubmit.setOnClickListener{
            val namaPengguna = etNama.text.toString()
            Toast.makeText(this, "Hallo ${namaPengguna}", Toast.LENGTH_SHORT).show()
            Log.d("submit", namaPengguna)
        }
    }
}
/*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
insets
*/