package com.poqstudio.app.client.cart

import androidx.lifecycle.MutableLiveData
import com.poqstudio.app.platform.domain.interactor.countryconfig.GetCurrentCountryConfig
import com.poqstudio.platform.view.checkout.cart.viewmodel.CartViewModel

class CustomCartViewModelImpl (
        private val cartViewModel: CartViewModel,
        private val currentCountryConfig: GetCurrentCountryConfig
) : CustomCartViewModel, CartViewModel by cartViewModel {

    override val countryName = MutableLiveData<String>()

    override fun loadCart() {
        cartViewModel.loadCart()
        countryName.postValue(currentCountryConfig().countryName)
    }

}