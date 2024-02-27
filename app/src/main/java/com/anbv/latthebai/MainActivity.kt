package com.anbv.latthebai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var img1 = findViewById<ImageView>(R.id.img1)
        var img2 = findViewById<ImageView>(R.id.img2)
        var img3 = findViewById<ImageView>(R.id.img3)
        var img4 = findViewById<ImageView>(R.id.img4)
        var img5 = findViewById<ImageView>(R.id.img5)
        var img6 = findViewById<ImageView>(R.id.img6)
        var img7 = findViewById<ImageView>(R.id.img7)
        var img8 = findViewById<ImageView>(R.id.img8)
        var img9 = findViewById<ImageView>(R.id.img9)
        var img10 = findViewById<ImageView>(R.id.img10)
        var img11 = findViewById<ImageView>(R.id.img11)
        var img12 = findViewById<ImageView>(R.id.img12)

        img1.setOnClickListener {
            img1.setImageResource(R.drawable.eternal)
            img7.setOnClickListener {
                img7.setImageResource(R.drawable.eternal)
            }
        }
        img2.setOnClickListener {
            img2.setImageResource(R.drawable.faiz)
            img8.setOnClickListener {
                img8.setImageResource(R.drawable.faiz)
            }
        }
        img3.setOnClickListener {
            img3.setImageResource(R.drawable.geiz)
            img9.setOnClickListener {
                img9.setImageResource(R.drawable.geiz)
            }
        }
        img4.setOnClickListener {
            img4.setImageResource(R.drawable.hazard)
            img10.setOnClickListener {
                img10.setImageResource(R.drawable.hazard)
            }
        }
        img5.setOnClickListener {
            img5.setImageResource(R.drawable.mugen)
            img11.setOnClickListener {
                img11.setImageResource(R.drawable.mugen)
            }
        }
        img6.setOnClickListener {
            img6.setImageResource(R.drawable.ryuki)
            img12.setOnClickListener {
                img12.setImageResource(R.drawable.ryuki)
            }
        }

    }
}