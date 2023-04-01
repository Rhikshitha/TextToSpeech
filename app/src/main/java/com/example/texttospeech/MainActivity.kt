package com.example.texttospeech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() , TextToSpeech.OnInitListener{
    lateinit var etText: EditText
    lateinit var  btSpeak: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onInit(p0: Int) {
        TODO("Not yet implemented")
    }
}