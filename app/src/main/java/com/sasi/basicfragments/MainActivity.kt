package com.sasi.basicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FragmentChangeCallback {

    override fun FragmentChangeCallback(fragmnet: Any) {
        fragmentManager?.let {
            var fragmentTransaction: FragmentTransaction = it.beginTransaction()
            fragmentTransaction.replace(R.id.fragment, Sample3Fragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

    }

    var fragmentManager: FragmentManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.printLog("Activity", "onCreate")
        setContentView(R.layout.activity_main)

        var sample1Fragment = Sample1Fragment()
        fragmentManager = supportFragmentManager
        fragmentManager?.let {
            var fragmentTransaction: FragmentTransaction = it?.beginTransaction()
            fragmentTransaction.replace(R.id.fragment, sample1Fragment)
            fragmentTransaction.commit()
        }


        btn_replace.setOnClickListener {
            fragmentManager?.let {
                val bundle = Bundle()
                bundle.putString("text", "Hello Fragment 2")
                var sample2Fragment = Sample2Fragment()
                sample2Fragment.arguments=bundle
                var fragmentTransaction: FragmentTransaction = it.beginTransaction()
                fragmentTransaction.replace(R.id.fragment, sample2Fragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }

        }
    }

    override fun onStart() {
        super.onStart()
        Utils.printLog("Activity", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Utils.printLog("Activity", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Utils.printLog("Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Utils.printLog("Activity", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Utils.printLog("Activity", "onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.printLog("Activity", "onDestroy")
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        if (fragment is Sample2Fragment) {
            val Sample2Fragment = fragment as Sample2Fragment
            Sample2Fragment.setCallbackListener(this)
        }
    }
}
