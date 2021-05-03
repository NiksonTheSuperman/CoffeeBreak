package com.example.nosmoking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.nosmoking.data.model.Coffee
import com.example.nosmoking.databinding.ActivityMainBinding
import com.example.nosmoking.ui.adapter.CoffeeAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityMainLlCart.setOnClickListener {

        }
        val coffeeAdapter = CoffeeAdapter()
        binding.activityMainRvCoffeeList.adapter = coffeeAdapter

        val coffeeList = arrayListOf(
            Coffee(1, "мочача", "", 100, "nfrjt ujdjyoyt z t,fk"),
            Coffee(2, "хуйня", "", 130, "залупа")
        )
        coffeeAdapter.submitList(coffeeList)
    }
}