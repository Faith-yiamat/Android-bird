package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev1
        binding.btnNextThree
        binding.btnPrev1.setOnClickListener {
            finish()
        }
        binding.btnNextThree.setOnClickListener {
            val  intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://img.freepik.com/premium-photo/nature-beautiful-birds-tree-by-ai-generator_963653-6.jpg?w=360").into(binding.imageView3)
    }
}
