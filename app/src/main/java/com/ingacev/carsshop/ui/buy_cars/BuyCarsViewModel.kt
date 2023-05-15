package com.ingacev.carsshop.ui.my_cars

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuyCarsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Buy Car Fragment"
    }
    val text: LiveData<String> = _text
}