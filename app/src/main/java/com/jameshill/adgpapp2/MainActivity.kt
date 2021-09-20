package com.jameshill.adgpapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Declare lateinit for these variables
    private lateinit var enter_name: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Initialize variables to resources
        enter_name = findViewById(R.id.name_input)
        button = findViewById(R.id.the_button)


        //Set the onClickListener for the button
        button.setOnClickListener {
            //Get input data from editText, assign to variable
            var name = enter_name.getText().toString()
            // If name is "Anakin", display special message.
            if (name == "Anakin") {
                Toast.makeText(this, "What a dork, get a life.", Toast.LENGTH_LONG).show()
            } else {// Otherwise,
                //Display toast with message.
                Toast.makeText(this, "Hello, $name!", Toast.LENGTH_LONG).show()
            }
        }
    }
    // When onPause is called, clear the editText field
    override fun onPause() {
        super.onPause()
        enter_name.text.clear()
    }
}


