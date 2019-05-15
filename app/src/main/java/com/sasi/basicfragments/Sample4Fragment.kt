package com.sasi.basicfragments


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


 
class Sample4Fragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Utils.printLog("Fragment4","onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.printLog("Fragment4","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Utils.printLog("Fragment4","onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample4, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Utils.printLog("Fragment4","onActivityCreated")
    }

    override fun onResume() {
        super.onResume()
        Utils.printLog("Fragment4","onResume")
    }

    override fun onPause() {
        super.onPause()
        Utils.printLog("Fragment4","onAttach")
    }

    override fun onStop() {
        super.onStop()
        Utils.printLog("Fragment4","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Utils.printLog("Fragment4","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Utils.printLog("Fragment4","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Utils.printLog("Fragment4","onDetach")
    }


}
