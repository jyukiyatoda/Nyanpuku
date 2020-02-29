package com.example.nyanpuku

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent


class SubActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent:Intent=getIntent()
        val selectedText:String=intent.getStringExtra("Text")
        val selectedPhoto:Int=intent.getIntExtra("Photo",0)

        val textView:TextView=findViewById(R.id.selected_text)
        textView.setText(selectedText)
        val imageView:ImageView=findViewById(R.id.selected_photo)
        imageView.setImageResource(selectedPhoto)

    }
}