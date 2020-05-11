package com.poqstudio.app.client.di

import com.poqstudio.app.platform.dagger.scope.FragmentScope
import com.poqstudio.platform.checkout.cartdagger.CartBuilderFragmentModule
import com.poqstudio.platform.component.cart.dagger.CartBuilderComponentModule
import com.poqstudio.platform.component.cart.dagger.CartComponentModule
import com.poqstudio.platform.component.wishlist.dagger.WishlistComponentModule
import com.poqstudio.platform.view.checkout.cart.ui.PoqCartFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ChangedFragmentBinder {

    @FragmentScope
    @ContributesAndroidInjector(modules = [
        CartBuilderFragmentModule::class,
        CustomCartViewModule::class,
        CartComponentModule::class,
        CartBuilderComponentModule::class,
        WishlistComponentModule::class
    ])
    abstract fun bindPoqCartFragment(): PoqCartFragment

}