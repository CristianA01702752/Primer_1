package com.example.primerprctica

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.TextViewCompat
import org.w3c.dom.Text

//nombre de clase y archivo deben coincidir

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button)
        val myEditText : EditText = findViewById<EditText>(R.id.EditText1)
        val myTextView : TextView = findViewById<TextView>(R.id.textView)

        var myString : String
        myButton.setOnClickListener{
            myString = myEditText.text.toString()
            myTextView.text = myString

            if (myString == "Uno"){
                myButton.setBackgroundColor(Color.GREEN)
            } else {
                myButton.setBackgroundColor(Color.RED)
            }
        }
    }
}