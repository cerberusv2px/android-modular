package com.sujin.modularfirst.base

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.sujin.mvvmsamplearchitecture.BR

open class BaseViewHolder(open val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: kotlin.Any) {
        //binding.setVariable(BR.item, item)
        binding.executePendingBindings()
    }
}