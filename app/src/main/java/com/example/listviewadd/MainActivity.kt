package com.example.listviewadd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listviewadd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     var peliculas: ArrayList<movie> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<*>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        peliculas.add( movie("titanic",2000,"",""))
        peliculas.add( movie("vengadores",2012,"",""))
        peliculas.add( movie("xmen",2020,"",""))
        peliculas.add( movie("gladiador",2003,"",""))

        var adapter= MyAdapter(this, peliculas)
        binding.listviewpeliculas.adapter=adapter
    }
}