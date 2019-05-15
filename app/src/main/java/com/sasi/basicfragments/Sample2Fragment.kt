package com.sasi.basicfragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sample2.*
import android.R.attr.fragment
import android.widget.Toast


class Sample2Fragment : Fragment() {
    private var mCallback: FragmentChangeCallback? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Utils.printLog("Fragment2", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.printLog("Fragment2", "onCreate")
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Utils.printLog("Fragment2", "onCreateView")
        var view: View = inflater.inflate(R.layout.fragment_sample2, container, false)

        // Inflate the layout for this fragment
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Toast.makeText(activity, "${arguments?.getString("text")}", Toast.LENGTH_SHORT).show()
        Utils.printLog("Fragment2", "onActivityCreated")
        btn_replaces.setOnClickListener {
            mCallback?.FragmentChangeCallback("")
        }
    }

    override fun onResume() {
        super.onResume()
        Utils.printLog("Fragment2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Utils.printLog("Fragment2", "onAttach")
    }

    override fun onStop() {
        super.onStop()
        Utils.printLog("Fragment2", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Utils.printLog("Fragment2", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.printLog("Fragment2", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Utils.printLog("Fragment2", "onDetach")
    }

    fun setCallbackListener(mCallback: FragmentChangeCallback) {
        this.mCallback = mCallback
    }


}
