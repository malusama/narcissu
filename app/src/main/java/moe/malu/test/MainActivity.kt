package moe.malu.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.onClick
import android.content.Intent;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_click.onClick {
            val intent = Intent(this@MainActivity, step2::class.java)
            startActivity(intent)
        }
    }
}
