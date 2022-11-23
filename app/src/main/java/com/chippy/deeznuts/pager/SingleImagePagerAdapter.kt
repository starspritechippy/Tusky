package com.chippy.deeznuts.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.chippy.deeznuts.ViewMediaAdapter
import com.chippy.deeznuts.fragment.ViewMediaFragment

class SingleImagePagerAdapter(
    activity: FragmentActivity,
    private val imageUrl: String
) : ViewMediaAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            ViewMediaFragment.newSingleImageInstance(imageUrl)
        } else {
            throw IllegalStateException()
        }
    }

    override fun getItemCount() = 1

    override fun onTransitionEnd(position: Int) {
    }
}
