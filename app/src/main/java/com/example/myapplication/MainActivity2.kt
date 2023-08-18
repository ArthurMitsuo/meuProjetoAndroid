package com.example.myapplication

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var BotaoNumero: TextView = findViewById(R.id.textView2);
        BotaoNumero.text = Random().nextInt(100).toString();
    }

    fun AvancaTela(view: View){
        val intent = Intent(this, MainActivity3::class.java)
        // start your next activity
        startActivity(intent)
    }

    fun FechaTela(view: View){
        finish();
    }
}