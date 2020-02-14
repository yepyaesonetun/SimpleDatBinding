package com.padcmyanmar.padcx.simpledatbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.padcmyanmar.padcx.simpledatbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

//        activityBinding.tvName.text = "Ko Ye"
//        activityBinding.tvAddress.text = "Yangon, Myanmar"

        activityBinding.user = UserVO("Ko Ye", "Sanchaung Township, Yangon, Myanmar")
        activityBinding.handler = EventHandler(mContext = this)

    }
}
