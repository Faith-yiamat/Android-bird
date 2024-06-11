package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var  binding: ActivityFourthBirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPrev
         binding.btnNext3
        binding.btnPrev.setOnClickListener {
            finish()
        }
        binding.btnNext3.setOnClickListener {
            val  intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://static.vecteezy.com/system/resources/thumbnails/023/122/855/small_2x/colorful-bird-on-a-background-of-nature-ai-generated-free-photo.jpg").into(binding.imageView4)

    }
}