package com.poqstudio.app.client.di

import com.poqstudio.app.platform.dagger.module.presentation.NavigatorModule
import com.poqstudio.app.platform.dagger.module.presentation.cart.CartNavigatorModule
import com.poqstudio.app.platform.dagger.scope.ActivityScope
import com.poqstudio.platform.checkout.cartdagger.CartBuilderModule
import com.poqstudio.platform.checkout.cartdagger.CartModule
import com.poqstudio.platform.core.dagger.SharedScreenModule
import com.poqstudio.platform.view.checkout.cart.ui.CartActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FirstAppActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        CartModule::class,
        CartBuilderModule::class,
        ChangedFragmentBinder::class,
        CartNavigatorModule::class,
        NavigatorModule::class,
        SharedScreenModule::class
    ])
    abstract fun bindCartActivity(): CartActivity

}