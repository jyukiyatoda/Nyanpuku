package com.example.nyanpuku.ui.zaisekicat

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ZaisekicatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is zaisekicat Fragment"
    }
    val text: LiveData<String> = _text
}