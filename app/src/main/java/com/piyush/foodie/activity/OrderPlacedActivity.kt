package com.piyush.foodie.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.piyush.foodie.R

class OrderPlacedActivity : AppCompatActivity() {

    lateinit var btnOkay: Button
    lateinit var orderPlaced: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_placed)

        orderPlaced = findViewById(R.id.orderPlaced)
        btnOkay = findViewById(R.id.btnOkay)

        btnOkay.setOnClickListener {

            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }

    override fun onBackPressed() {
        //user can't go back
    }
}
