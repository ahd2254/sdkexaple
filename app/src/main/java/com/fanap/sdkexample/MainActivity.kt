package com.fanap.sdkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aliance.roundeimage.CustomImage

class MainActivity : AppCompatActivity() {
    val roundedImage: CustomImage = CustomImage()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("TAG", "onCreate: " + roundedImage.getRoundedImage())
    }
}