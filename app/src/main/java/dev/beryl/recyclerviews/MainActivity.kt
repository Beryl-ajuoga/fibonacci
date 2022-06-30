package dev.beryl.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.beryl.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaynumbers()

    }
    fun displaynumbers(){
        var numberList = minor(100)
        val numberAdapter = NumbersRecyclerviewAdapter(numberList)
        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        binding.rvNumber.adapter=numberAdapter
    }

    fun minor(n:Int):List<Int> {
        var list = ArrayList<Int>()
        var x = 0
        var y = 1
        for (i in 0..n) {
            var sum = x+ y
            x = y
            y = sum
        }
        return list
    }

}