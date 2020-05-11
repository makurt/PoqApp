package com.poqstudio.app.client.di

import android.app.Activity
import com.poqstudio.app.client.navigator.CustomNavigator
import com.poqstudio.app.platform.navigation.Navigator
import org.koin.dsl.module

val customScreenModule = module {
    factory<Navigator>(override = true) { (activity: Activity) -> CustomNavigator(activity) }
}