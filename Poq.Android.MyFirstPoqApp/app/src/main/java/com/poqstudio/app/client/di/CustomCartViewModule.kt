package com.poqstudio.app.client.di

import com.poqstudio.app.client.cart.CustomCartViewModelImpl
import com.poqstudio.app.platform.dagger.scope.FragmentScope
import com.poqstudio.app.platform.domain.interactor.countryconfig.GetCurrentCountryConfig
import com.poqstudio.platform.view.checkout.cart.dependencyprovider.CartPresentationDependencyProvider
import dagger.Module
import dagger.Provides

@Module
class CustomCartViewModule {

    @Provides
    @FragmentScope
    fun provideCustomCartViewModel(
            builder: CartPresentationDependencyProvider.Builder,
            getCurrentCountryConfig: GetCurrentCountryConfig
    ): CartPresentationDependencyProvider {
        builder.setCartViewModel(CustomCartViewModelImpl(builder.getCartViewModel(), getCurrentCountryConfig))
        return builder.build()
    }

}