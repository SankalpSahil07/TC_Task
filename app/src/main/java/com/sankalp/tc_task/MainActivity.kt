package com.sankalp.tc_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnHome : Button
    //lateinit var btnEdit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHome = findViewById(R.id.buttonhome)
       //btnEdit = findViewById(R.id.buttonedit)

        btnHome.setOnClickListener {
            val homePage = Intent(this@MainActivity, HomePageActivity::class.java)
            startActivity(homePage)
        }
       /* btnEdit.setOnClickListener {
            val editPage = Intent(this@MainActivity,EditPageActivity::class.java)
            startActivity(editPage)
        }*/

    }
}