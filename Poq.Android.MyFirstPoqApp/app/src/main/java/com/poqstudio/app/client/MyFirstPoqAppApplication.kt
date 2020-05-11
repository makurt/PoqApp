package com.poqstudio.app.client

import com.poqstudio.app.client.di.BaseActivityBuilder
import com.poqstudio.app.client.di.FirstAppActivityBuilder
import com.poqstudio.app.client.di.customScreenModule
import com.poqstudio.app.platform.PoqApplication
import com.poqstudio.app.platform.PoqApplicationComponent
import com.poqstudio.app.platform.injection.annotations.PoqComponent
import org.koin.core.context.loadKoinModules

@PoqComponent(
    extraModules = [
        BaseActivityBuilder::class,
        FirstAppActivityBuilder::class
    ]
) class MyFirstPoqAppApplication : PoqApplication() {
    
    private lateinit var component: MyFirstPoqAppApplicationComponent
    
    override fun createAppComponent(): PoqApplicationComponent {
        loadKoinModules(customScreenModule)
        component = DaggerMyFirstPoqAppApplicationComponent.builder()
            .application(this)
            .build()
        return component
    }
    
    override fun inject() {
        component.inject(this)
    }
    
}
