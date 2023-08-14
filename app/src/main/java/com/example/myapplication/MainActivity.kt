package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textoPrincipal = this.findViewById<TextView>(R.id.textView)
        textoPrincipal.setText("VAI");

        var botaoPrincipal = this.findViewById<Button>(R.id.button)
        botaoPrincipal.setOnClickListener{
            if(textoPrincipal.getText().equals("VAi")){
                textoPrincipal.setText("TOMAR NO")
            }else if (textoPrincipal.getText().equals("TOMAR NO")){
                textoPrincipal.setText("CELULAR")
            }else {
                textoPrincipal.setText("VAI")
            }
        }

    }
}