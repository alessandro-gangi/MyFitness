package com.example.myfitness.view.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class RichiestePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var myFragmentList: ArrayList<Fragment> = ArrayList()
    private var myFragmentTitleList: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return myFragmentList[position]
    }

    override fun getCount(): Int {
        return myFragmentList.size
    }


    override fun getPageTitle(position: Int): CharSequence {
        return myFragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String){
        myFragmentList.add(fragment)
        myFragmentTitleList.add(title)
    }
}