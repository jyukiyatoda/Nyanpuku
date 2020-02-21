package com.example.nyanpuku.ui.zaisekicat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.widget.ImageView
import com.example.nyanpuku.R

class ZaisekicatFragment : Fragment() {

    private lateinit var zaisekicatViewModel: ZaisekicatViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        zaisekicatViewModel =
            ViewModelProviders.of(this).get(ZaisekicatViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        zaisekicatViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }


}