package com.example.listviewadd

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.listviewadd.databinding.ItemPeliculaBinding

class MyAdapter(private val context: Context, private val arrayList: java.util.ArrayList<movie>):
    BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val binding=ItemPeliculaBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        var convertView =convertView
        convertView=binding.root

        binding.txttitle.text=arrayList[position].title
        binding.txtyear.text="${arrayList[position].year}"
        return convertView
    }

}