package com.neppplus.orderapp_20220618.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.orderapp_20220618.fragments.MyProfileFragment
import com.neppplus.orderapp_20220618.fragments.PizzaStoreFragment

class MainViewPagerAdapter( fm: FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when( position ) {
            0 -> PizzaStoreFragment()
            else -> MyProfileFragment()
        }

    }
}