package com.example.wetherapp_2_lesson.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.wetherapp_2_lesson.R
import com.example.wetherapp_2_lesson.adapters.WeatherAdapter
import com.example.wetherapp_2_lesson.adapters.WeatherModel
import com.example.wetherapp_2_lesson.databinding.FragmentDaysBinding
import com.example.wetherapp_2_lesson.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel("", "12:00",
                "Sunny", "15°С",
                "", "",
                "", ""),
            WeatherModel("", "13:00",
                "Sunny", "20°С",
                "", "",
                "", ""),
            WeatherModel("", "14:00",
                "Sunny", "23°С",
                "", "",
                "", ""),
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}