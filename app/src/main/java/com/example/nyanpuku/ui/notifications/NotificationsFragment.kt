package com.example.nyanpuku.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.widget.AdapterView
import android.widget.ListView
import com.example.nyanpuku.ListViewAdapter
import com.example.nyanpuku.R
import com.example.nyanpuku.SubActivity

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)

        notificationsViewModel.text.observe(this, Observer {

        })
        return root
    }




    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)

        var mListViewAdapter= ListViewAdapter(context!!)
        //Listviewのインスタンス生成
        val listView:ListView=view.findViewById(R.id.list_view)
        //ListviewにListViewAdapterを設定
        listView.adapter=mListViewAdapter
        mListViewAdapter.notifyDataSetChanged()


        //リストビューのアイテムクリック時の挙動
        listView.setOnItemClickListener({ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->

                    //インテントのインスタンス生成
                    val intent=Intent(getActivity(), SubActivity::class.java)
                    //クリックされたPositionのtextとphotoのID
                    val getmozi=ListViewAdapter::mozi
                    val getphots=ListViewAdapter::phots
                    var selectedText: MutableList<String> =getmozi[position]
                    var selrctedPhoto:MutableList<Int> =getphots[position]
            //インテントにセット
            intent.putExtra("Text",selectedText)
            intent.putExtra("Photo",selrctedPhoto)
            //SubActivityへ移動
            startActivity(intent)


            })

    }
}