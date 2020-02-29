package com.example.nyanpuku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.nyanpuku.R

class ListViewAdapter(val context: Context):BaseAdapter() {

    val inflater:LayoutInflater= LayoutInflater.from(context)

    var mozi= mutableListOf<String>(
        "新着情報はありません",
        "新着情報はありません",
        "新着情報はありません",
        "新着情報はありません",
        "新着情報はありません"
    )
    var phots= mutableListOf<Int>(
        R.drawable.jiji,
        R.drawable.nico,
        R.drawable.jiji,
        R.drawable.nico,
        R.drawable.jiji
    )

    override fun getCount(): Int {
        return mozi.size
    }
    override fun getItem(position: Int): Any {
        return mozi[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view :View=convertView ?:inflater.inflate(R.layout.list_item,null)
        var imageView=view.findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(phots[position])

        var textView=view.findViewById<TextView>(R.id.textView)
        textView.setText(mozi[position])

        return view
    }


}