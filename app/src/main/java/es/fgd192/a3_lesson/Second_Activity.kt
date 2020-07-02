package es.fgd192.a3_lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
        val sign_up = findViewById<Button>(R.id.button)
        val write4 = findViewById<EditText>(R.id.write4)
        val write3 = findViewById<EditText>(R.id.write3)
        val write2 = findViewById<EditText>(R.id.write2)
        val write = findViewById<EditText>(R.id.write)
        sign_up.setOnClickListener{
        val intent = Intent(applicationContext,Третий_Activity::class.java)
        startActivity(intent)
        }
    }
}