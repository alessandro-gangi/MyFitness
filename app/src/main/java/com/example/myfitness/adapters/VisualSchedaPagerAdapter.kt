package com.example.myfitness.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myfitness.data.Scheda
import com.example.myfitness.fragments.VisualizzazioneEserciziFragment

//class VisualSchedaPagerAdapter(fm: FragmentManager, val scheda: Scheda) : FragmentPagerAdapter(fm) {
class VisualSchedaPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var myFragmentList: ArrayList<Fragment> = ArrayList()
    private var myFragmentTitleList: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return myFragmentList[position]
    }

    override fun getCount(): Int {
        //return 3
        return myFragmentList.size
    }


    override fun getPageTitle(position: Int): CharSequence {
        //return "ciao"
        return myFragmentTitleList[position]
        /*return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> {
                return "Third Tab"
            }
        }*/
    }

    fun addFragment(fragment: Fragment, title: String){
        myFragmentList.add(fragment)
        myFragmentTitleList.add(title)
    }
}