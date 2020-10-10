package com.example.outstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        home_layout.setVisibility(View.VISIBLE)
        search_layout.setVisibility(View.INVISIBLE)
        notification_layout.setVisibility(View.INVISIBLE)
        home_btn.setOnClickListener{
            home_layout.setVisibility(View.VISIBLE)
            search_layout.setVisibility(View.INVISIBLE)
            notification_layout.setVisibility(View.INVISIBLE)
        }
        search_btn.setOnClickListener {
            home_layout.setVisibility(View.INVISIBLE)
            search_layout.setVisibility(View.VISIBLE)
            notification_layout.setVisibility(View.INVISIBLE)
        }
        notification_btn.setOnClickListener {
            home_layout.setVisibility(View.INVISIBLE)
            search_layout.setVisibility(View.INVISIBLE)
            notification_layout.setVisibility(View.VISIBLE)
        }
    }
}