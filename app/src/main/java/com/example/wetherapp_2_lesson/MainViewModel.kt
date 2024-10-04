package com.example.wetherapp_2_lesson

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wetherapp_2_lesson.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}