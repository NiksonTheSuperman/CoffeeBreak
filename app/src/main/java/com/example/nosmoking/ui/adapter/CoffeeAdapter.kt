package com.example.nosmoking.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nosmoking.data.model.Coffee
import com.example.nosmoking.databinding.CoffeeItemBinding

class CoffeeAdapter :
    ListAdapter<Coffee, CoffeeAdapter.CoffeeViewHolder>(CoffeeItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val binding = CoffeeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoffeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class CoffeeViewHolder(val coffeeItemBinding: CoffeeItemBinding) :
        RecyclerView.ViewHolder(coffeeItemBinding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Coffee) {
            coffeeItemBinding.coffeeItemTvName.text = item.name
            coffeeItemBinding.coffeeItemTvDescription.text = item.description
            coffeeItemBinding.coffeeItemBtnBuy.text = "от ${item.price} рублей"
        }
    }

    class CoffeeItemCallback : DiffUtil.ItemCallback<Coffee>() {
        override fun areItemsTheSame(old: Coffee, aNew: Coffee): Boolean {
            return old.id == aNew.id
        }

        override fun areContentsTheSame(old: Coffee, aNew: Coffee): Boolean {
            return old == aNew
        }

    }

}