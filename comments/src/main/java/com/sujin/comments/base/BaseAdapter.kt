package com.sujin.comments.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Recyclerview adapter using paging arch component
 *
 * @param T entity model
 * @param VH ViewHolder class
 */
abstract class BaseAdapter<T, VH : BaseViewHolder, B : ViewDataBinding> :
    RecyclerView.Adapter<VH>() {

    lateinit var binding: B

    abstract fun getLayoutResource(viewType: Int): Int

    abstract fun getViewHolder(binding: ViewDataBinding, viewType: Int): VH

    abstract fun onBindCustomViewHolder(holder: VH, position: Int)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate<B>(
            layoutInflater,
            getLayoutResource(viewType),
            parent,
            false
        )
        return getViewHolder(binding, viewType)
    }

    override fun onBindViewHolder(holder: VH, position: Int) =
        onBindCustomViewHolder(holder, position)
}