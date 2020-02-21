package com.example.nyanpuku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import kotlin.coroutines.coroutineContext

class GridAdapter:BaseAdapter() {
    private val mLayoutInflater:LayoutInflater
    var gazouList= mutableListOf<Int>()

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

        val view :View=convertView ?:mLayoutInflater.inflate(android.R.layout.fragment_zaisekicat,null)
        ImageView view=(ImageView)view.findViewById(R.id.grid_item)
        view.setImageBitmap(getItem(position))

        return view
    }
}
