package com.example.recycle.MyData

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycle.R
import com.example.recycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(
            binding.root
        )

        val Mylist = ArrayList<Activities>()
//        Mylist.add(Activities(R.drawable.ic_launcher_background,"Wake up","Morning"))
//        Mylist.add(Activities(R.drawable.ic_launcher_foreground, "Pray", "Morning"))
//        Mylist.add(Activities(R.drawable.ic_android_black_24dp,"Eat break fast","Morning"))
//        Mylist.add(Activities(R.drawable.ic_launcher_foreground,"Go Jogging","Morning"))
//        Mylist.add(Activities(com.google.android.material.R.drawable.ic_clock_black_24dp,"Go to Work","Morning"))
//        Mylist.add(Activities(com.google.android.material.R.drawable.ic_m3_chip_check,"Watch a Movie","Afternoon"))
//        Mylist.add(Activities(R.drawable.ic_android_black_24dp,"Cook dinner","Evening"))
//        Mylist.add(Activities(R.drawable.ic_launcher_foreground,"Eat dinner","Evening"))
//        Mylist.add(Activities(R.drawable.ic_launcher_background,"Pray","Evening"))
//        Mylist.add(Activities(R.drawable.ic_launcher_background,"Sleep","Evening"))


        Mylist.add(Activities(R.drawable.wakeup,"Wake up","Morning"))
        Mylist.add(Activities(R.drawable.pray, "Pray", "Morning"))
        Mylist.add(Activities(R.drawable.breakfast,"Eat break fast","Morning"))
        Mylist.add(Activities(R.drawable.jogging,"Go Jogging","Morning"))
        Mylist.add(Activities(R.drawable.work,"Go to Work","Morning"))
        Mylist.add(Activities(R.drawable.movie,"Watch a Movie","Afternoon"))
        Mylist.add(Activities(R.drawable.cook,"Cook dinner","Evening"))
        Mylist.add(Activities(R.drawable.dinner,"Eat dinner","Evening"))
        Mylist.add(Activities(R.drawable.pray,"Pray","Evening"))
        Mylist.add(Activities(R.drawable.sleep,"Sleep","Evening"))





        val MyAdapter = ActivityAdapter(this,Mylist)
        val RecyclerView = binding.recyclerView
        RecyclerView.adapter = MyAdapter
        //RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.layoutManager = GridLayoutManager(this,2)

    }
}