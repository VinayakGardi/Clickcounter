

package com.vinayakgardi.Clickercounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var button : Button? = null
    private var textView : TextView? = null
    private  var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {

                count+=1
                textView?.setText("Number of times button clicked :  $count")
                Toast.makeText(this@MainActivity, "$count", Toast.LENGTH_SHORT).show()


            }
        })


    }
}