package com.example.nyanpuku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class GridAdapter(val context: Context) :BaseAdapter() {
    private val mLayoutInflater:LayoutInflater
    var gazouList= mutableListOf<Int>(
        R.drawable.gazou_1,
        R.drawable.gazou_2,
        R.drawable.gazou_3,
        R.drawable.gazou_4,
        R.drawable.gazou_5,
        R.drawable.gazou_6,
        R.drawable.gazou_7,
        R.drawable.gazou_8,
        R.drawable.gazou_9,
        R.drawable.gazou_10
    )

    init {
        this.mLayoutInflater= LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return gazouList.size
    }
    override fun getItem(position: Int): Any {
        return gazouList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view :View=convertView ?:mLayoutInflater.inflate(R.layout.fragment_zaisekicat,null)
        var imageView1=view.findViewById<ImageView>(R.id.grid_item)
        imageView1.setImageResource(gazouList[position])

        return view
    }
}
