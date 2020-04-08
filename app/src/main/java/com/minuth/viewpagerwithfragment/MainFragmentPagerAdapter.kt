package com.minuth.viewpagerwithfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainFragmentPagerAdapter(private val fragments: List<Fragment>, fragmentManager: FragmentManager):
    FragmentStatePagerAdapter(fragmentManager,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment = fragments[position]
    override fun getCount(): Int  = fragments.size

}