package com.padcmyanmar.padcx.simpledatbinding

import android.content.Context
import android.widget.Toast


/**
 * Created by Ye Pyae Sone Tun
 * on 2020-02-14.
 */

class EventHandler(mContext: Context) {
    var mContext: Context
    fun onButtonClick(name: String) {
        Toast.makeText(mContext, "Hello $name", Toast.LENGTH_SHORT).show()
    }

    init {
        this.mContext = mContext
    }
}