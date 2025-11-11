package com.example.tugasuts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
           droid:text="Email" />        <TextView            android:layout_width="wrap_content"            android:layout_height="wrap_content"            android:layout_gravity="center_horizontal"            android:layout_marginBottom="24dp"            android:text="Formulir Pendaftaran"            android:textColor="#E65100"            android:textStyle="bold"            android:textSize="24sp" />    <EditTe