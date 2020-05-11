package com.poqstudio.app.client.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.poqstudio.app.client.R
import com.poqstudio.platform.core.ui.CoreActivity

class CustomScreenActivity : CoreActivity() {

    companion object {

        fun startCustomScreen(context: Context) = Intent(context, CustomScreenActivity::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_screen)
    }
}
