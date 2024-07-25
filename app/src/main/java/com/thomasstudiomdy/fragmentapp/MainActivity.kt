package com.thomasstudiomdy.fragmentapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

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

        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)

        btn1.setOnClickListener(){
            val fragment1:Fragment = SignInFragment()

            val frtrans:FragmentTransaction = supportFragmentManager.beginTransaction()
            frtrans.replace(R.id.frame1,fragment1).commit()
          }

        btn2.setOnClickListener(){
            val fragment2:Fragment = SignUpFragment()

            val frtrans:FragmentTransaction = supportFragmentManager.beginTransaction()
            frtrans.replace(R.id.frame2,fragment2).commit()
        }
    }
}