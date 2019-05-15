package com.sasi.basicfragments

import android.util.Log

object  Utils {
    public fun printLog(from:String,msg: String) {
        Log.v("State: $from :", "$msg")
    }

}