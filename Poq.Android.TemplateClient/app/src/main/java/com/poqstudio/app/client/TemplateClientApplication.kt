package com.poqstudio.app.client

import com.poqstudio.app.platform.PoqApplication
import com.poqstudio.app.platform.PoqApplicationComponent
import com.poqstudio.app.platform.dagger.component.ActivityBuilder
import com.poqstudio.app.platform.injection.annotations.PoqComponent

@PoqComponent(
    extraModules = [
        ActivityBuilder::class
    ]
) class TemplateClientApplication : PoqApplication() {
    
    private lateinit var component: TemplateClientApplicationComponent
    
    override fun createAppComponent(): PoqApplicationComponent {
        component = DaggerTemplateClientApplicationComponent.builder()
            .application(this)
            .build()
        return component
    }
    
    override fun inject() {
        component.inject(this)
    }
    
}
