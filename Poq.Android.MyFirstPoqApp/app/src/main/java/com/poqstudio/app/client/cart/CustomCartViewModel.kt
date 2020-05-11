package com.poqstudio.app.client.cart

import androidx.lifecycle.LiveData
import com.poqstudio.platform.view.checkout.cart.viewmodel.CartViewModel

interface CustomCartViewModel : CartViewModel {
    val countryName: LiveData<String>
}