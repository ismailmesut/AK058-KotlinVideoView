package com.ismailmesutmujde.kotlinvideoview

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinvideoview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonStart.setOnClickListener {
            val address = Uri.parse("android.resource://"+packageName+"/"+R.raw.video)

            bindingMain.videoView.setVideoURI(address)
            bindingMain.videoView.start()
        }

        bindingMain.buttonStop.setOnClickListener {
            bindingMain.videoView.stopPlayback()
        }

    }
}