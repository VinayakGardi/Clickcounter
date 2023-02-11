

package com.vinayakgardi.Clickercounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var button : Button? = null
    private var textView : TextView? = null
    private  var editText : EditText? = null
    //private  var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        editText = findViewById<EditText>(R.id.editText)

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {

                textView?.setText(editText?.text)




            }
        })


    }
}