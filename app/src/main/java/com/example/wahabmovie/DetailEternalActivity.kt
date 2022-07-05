package com.example.wahabmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailEternalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_eternal)

        supportActionBar?.title = "Detail Eternal Character"

        val eternal = intent.getParcelableExtra<Eternal>(MainActivity.INTENT_PARCELABLE)

        val imgEternal = findViewById<ImageView>(R.id.img_item_photo)
        val nameEternal = findViewById<TextView>(R.id.tv_item_name)
        val descEternal = findViewById<TextView>(R.id.tv_item_description)
        val desc2Eternal = findViewById<TextView>(R.id.tv_item_description2)

        imgEternal.setImageResource(eternal?.imgEternal!!)
        nameEternal.text = eternal.nameEternal
        descEternal.text = eternal.descEternal
        desc2Eternal.text = eternal.desc2Eternal
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}