package com.ingacev.carsshop.ui.my_cars

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCarsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Car Fragment"
    }
    val text: LiveData<String> = _text
}