package com.example.hello

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var  binding: ActivityFifthBirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev4
        binding.btnPrev4.setOnClickListener {
            finish()
        }
        Picasso.get().load("https://img.freepik.com/premium-photo/photo-colorful-bird-with-red-green-wings-is-flying-now_695324-104.jpg").into(binding.imageView5)


    }
}