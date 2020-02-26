package com.example.nyanpuku.ui.zaisekicat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.widget.GridView
import com.example.nyanpuku.GridAdapter
import com.example.nyanpuku.R
import kotlinx.android.synthetic.main.fragment_zaisekicat.*

class ZaisekicatFragment : Fragment() {

    private lateinit var zaisekicatViewModel: ZaisekicatViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        zaisekicatViewModel =
            ViewModelProviders.of(this).get(ZaisekicatViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_zaisekicat, container, false)
        zaisekicatViewModel.text.observe(this, Observer {

        })
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var mGridAdapter = GridAdapter(context!!)
        //GridViewのインスタンス生成
        val gridView: GridView = view.findViewById(R.id.gridview)
        //GridviewにGridAdapterをセット
        gridview.adapter = mGridAdapter
    }
}