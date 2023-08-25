package com.example.recycle.MyData

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycle.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)

        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch {
            delay(3500)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }
}
