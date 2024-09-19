package com.example.photoframeapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.photoframeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var names = arrayOf("Dinasuar", "Monkey", "Tiger", "Cat")

    var currentImage = 0
    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imgPrev.setOnClickListener {
            val idCurrentImageString = "pic$currentImage"

            val idCurrentImageInt =
                this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (4 + currentImage - 1) % 4

            val idImageToShowString = "pic$currentImage"

            val idImageToShowInt =
                this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            binding.textView.text = names[currentImage]

        }

        binding.imgNext.setOnClickListener {
            val idCurrentImageString = "pic$currentImage"

            val idCurrentImageInt =
                this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (4 + currentImage + 1) % 4

            val idImageToShowString = "pic$currentImage"

            val idImageToShowInt =
                this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            binding.textView.text = names[currentImage]

        }
    }
}