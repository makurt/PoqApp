package com.poqstudio.app.client.navigator

import android.app.Activity
import com.poqstudio.app.client.view.CustomScreenActivity
import com.poqstudio.app.platform.navigation.PoqNavigator

class CustomNavigator(origin: Activity) : PoqNavigator(origin) {

    override fun gotoScan() {
        origin.startActivity(CustomScreenActivity.startCustomScreen(origin))
    }

}