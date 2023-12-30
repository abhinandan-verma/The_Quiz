package com.abhicoding.thequiz.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.abhicoding.thequiz.R
import com.abhicoding.thequiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_result)

        binding.score.text = ""+MainActivity.result + "/"+ MainActivity.totalQuestions
        binding.backBtn.setOnClickListener {
            val intent = Intent(this@ResultActivity,MainActivity::class.java)
            startActivity(intent)

        }
    }
}