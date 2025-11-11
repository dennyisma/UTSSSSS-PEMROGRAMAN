package com.example.tugasuts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val username = findViewById<EditText>(R.id.editTextText)
        val email = findViewById<EditText>(R.id.editEmail)
        val namaDepan = findViewById<EditText>(R.id.etNamaDepan)
        val namaBelakang = findViewById<EditText>(R.id.etNamaBelakang)
        val password = findViewById<EditText>(R.id.editTextTextPassword2)
        val konfirmasiPassword = findViewById<EditText>(R.id.editTextTextPassword3)
        val btnKirim = findViewById<Button>(R.id.btnCancel)

        btnKirim.setOnClickListener {
            if (username.text.isEmpty() || email.text.isEmpty() ||
                namaDepan.text.isEmpty() || namaBelakang.text.isEmpty() ||
                password.text.isEmpty() || konfirmasiPassword.text.isEmpty()
            ) {
                Toast.makeText(this, "Semua input harus terisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.text.toString() != konfirmasiPassword.text.toString()) {
                Toast.makeText(this, "Password dan Konfirmasi Password tidak sama!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val username = findViewById<EditText>(R.id.editTextText)
            val email = findViewById<EditText>(R.id.editEmail)
            val namaDepan = findViewById<EditText>(R.id.etNamaDepan)
            val namaBelakang = findViewById<EditText>(R.id.etNamaBelakang)
            val password = findViewById<EditText>(R.id.editTextTextPassword2)
            val konfirmasiPassword = findViewById<EditText>(R.id.editTextTextPassword3)
            val btnKirim = findViewById<Button>(R.id.btnCancel) // tombol "Kirim"

            btnKirim.setOnClickListener {

                if (username.text.isEmpty() || email.text.isEmpty() ||
                    namaDepan.text.isEmpty() || namaBelakang.text.isEmpty() ||
                    password.text.isEmpty() || konfirmasiPassword.text.isEmpty()
                ) {
                    Toast.makeText(this, "Semua input harus terisi!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                if (password.text.toString() != konfirmasiPassword.text.toString()) {
                    Toast.makeText(this, "Password dan Konfirmasi Password tidak sama!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val namaLengkap = namaDepan.text.toString() + " " + namaBelakang.text.toString()
                Toast.makeText(this, "$namaLengkap — Pendaftaran Berhasil!", Toast.LENGTH_LONG).show()
            }

        }

    }
}