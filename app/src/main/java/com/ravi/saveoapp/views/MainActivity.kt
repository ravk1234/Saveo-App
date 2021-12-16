package com.ravi.saveoapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ravi.saveoapp.R
import com.ravi.saveoapp.fragments.BaseFragment


class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment()
    }

    private fun addFragment() {
        val baseFragment = BaseFragment()
        /*
           This is the method used to send FragmentListener from Activity to BaseFragment
        */
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment1, baseFragment, "baseFragment").addToBackStack(null)
            .commit()
    }

    //check if fragments are still alive
    override fun onBackPressed() {
//        super.onBackPressed()
        val fragment = fragmentManager.findFragmentById(R.id.fragment1)
        if (fragment != null) {
            fragmentManager.beginTransaction().remove(fragment).commit()
        } else {
            super.onBackPressed()
        }

    }
}