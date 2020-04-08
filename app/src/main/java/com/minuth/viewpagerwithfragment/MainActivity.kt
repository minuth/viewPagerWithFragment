package com.minuth.viewpagerwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minuth.viewpagerwithfragment.fragment.FragmentA
import com.minuth.viewpagerwithfragment.fragment.FragmentB
import com.minuth.viewpagerwithfragment.fragment.FragmentC
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mutableListOf(FragmentA(),FragmentB(),FragmentC()).apply {
            MainFragmentPagerAdapter(this, supportFragmentManager).apply {
                viewPager.adapter = this
            }
        }

        btnA.setOnClickListener {
            viewPager.currentItem = 0
        }
        btnB.setOnClickListener {
            viewPager.currentItem = 1
        }
        btnC.setOnClickListener {
            viewPager.currentItem = 2
        }
    }
}
