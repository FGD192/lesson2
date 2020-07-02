package es.fgd192.a3_lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.temporal.TemporalAdjusters.next

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Truelogin = "FGD192"
        val Truepasword = "28070521"
        val logintext = write.text.toString()
        val passwordtext =  write2.text.toString()
        val next = findViewById<Button>(R.id.button)
        val write2 = findViewById<EditText>(R.id.write2)
        val write = findViewById<EditText>(R.id.write)
        next.setOnClickListener{
        val intent = Intent(applicationContext,Second_Activity::class.java)
        startActivity(intent)}
        if (Truelogin == logintext && Truepasword == passwordtext){
            Toast.makeText(applicationContext,"Доступ разрешен",Toast.LENGTH_LONG).show()
        }else{Toast.makeText(applicationContext,"Доступ запрещён",Toast.LENGTH_LONG).show()
        }
    }
}