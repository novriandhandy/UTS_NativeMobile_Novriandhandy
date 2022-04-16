package com.example.utsnativemobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCharActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_char)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val charre = intent.getParcelableExtra<CharRe>(MainActivity.INTENT_PARCELABLE)

        val imgChar = findViewById<ImageView>(R.id.img_item_photo)
        val nameChar = findViewById<TextView>(R.id.tv_item_name)
        val descChar = findViewById<TextView>(R.id.tv_item_description)

        imgChar.setImageResource(charre?.imgChar!!)
        nameChar.text = charre.nameChar
        descChar.text = charre.descChar
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}