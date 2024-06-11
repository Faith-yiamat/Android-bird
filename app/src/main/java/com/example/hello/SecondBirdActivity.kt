package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev
        binding.btnNext2
        binding.btnPrev.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val  intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/236x/bf/cd/50/bfcd50ff1e74a8c67afc3ec61f128002.jpg").into(binding.imageView2)


    }
}