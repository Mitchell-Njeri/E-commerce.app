package com.example.e_commerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Button with intent

        val btn = findViewById<Button>(R.id.btl_intent)

        btn.setOnClickListener {
           val try_intent = Intent(this,HomeActivity::class.java)
            startActivity(try_intent)
        }
    }
}
//ViewGroup -is an invisible container of other view
//(child view) and other viewgroup

//view-basic building block of UI
//(User-Interface)
