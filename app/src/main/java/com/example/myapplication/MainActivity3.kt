package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val Texto : TextView= findViewById(R.id.textView3);
        Texto.text = Random().nextInt(100).toString()
    }

    fun MudaTela(view:View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent);
    }

    fun FechaTela(view: View){
        finish();
    }
}