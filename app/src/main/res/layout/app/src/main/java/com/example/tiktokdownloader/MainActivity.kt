package com.example.tiktokdownloader

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtUrl = findViewById<EditText>(R.id.edtUrl)
        val btnDownload = findViewById<Button>(R.id.btnDownload)

        btnDownload.setOnClickListener {
            val link = edtUrl.text.toString().trim()
            if (link.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đường dẫn video!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Đang xử lý link: $link", Toast.LENGTH_LONG).show()
            }
        }
    }
}
