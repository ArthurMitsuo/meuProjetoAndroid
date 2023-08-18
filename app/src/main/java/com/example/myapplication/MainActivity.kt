package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
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
        }*/
    /*
        val languageName:String = "Kotlin"; //constante
        var laguageName: String = null;  //não funciona/compila
        var laguageName: String? = null; //funciona
    */
        var button1:Button = findViewById(R.id.button);
        var doido:Int = 1;


        /*button1.setOnClickListener{
            Toast.makeText(this, "Clicou", Toast.LENGTH_LONG).show();



            var imagem:ImageView = findViewById(R.id.imageView2);
            var checkBox:CheckBox = findViewById(R.id.checkBox2)
            val marcado = checkBox.isChecked

            if(marcado){
                imagem.setImageResource(R.mipmap.pablo_escobar)

            }else{
                imagem.setImageResource(R.mipmap.albert_hoffman)
            }


        }*/


    }
    fun proximaTela(view:View){
        val intent = Intent(this, MainActivity2::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun clicouTrocou(view: View){
        var checkBox:CheckBox = findViewById(R.id.checkBox2)
        val marcado:Boolean = checkBox.isChecked;
        var imagem:ImageView = findViewById(R.id.imageView2);

        if(marcado){
            imagem.setImageResource(R.mipmap.pablo_escobar)

        }else{
            imagem.setImageResource(R.mipmap.albert_hoffman)
        }
    }
}