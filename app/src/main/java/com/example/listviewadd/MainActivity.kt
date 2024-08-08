package com.example.listviewadd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listviewadd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var peliculas = emptyArray<String>()
    lateinit var arrayAdapter: ArrayAdapter<*>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val peliculas = arrayOf(
           "titanic","deepool","los vengadores","triplex",
       )

        var itemsAdapter = ArrayAdapter<String>(MainActivity@this, android.R.layout.simple_list_item_1,peliculas)
        binding.listviewpeliculas.adapter=itemsAdapter
    }
}