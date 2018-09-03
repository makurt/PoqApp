package com.poqstudio.app.client;


import com.poqstudio.app.platform.PoqApplication;
import com.poqstudio.app.platform.dagger.component.*;
import com.poqstudio.app.platform.model.AppConfig;

/**
 * @deprecated This class should be provided by platform
 */
@Deprecated
public class TestPoqApplication extends PoqApplication {

    public static void setAppComponent(AppComponent appComponent) {
        PoqApplication.appComponent = appComponent;
    }

    @Override
    protected AppConfig createAppConfig() {
        return new TestPoqConfig(this);
    }

    public void setTestPoqConfig(TestPoqConfig testPoqConfig) {
        appConfig = testPoqConfig;
    }


    @Override
    protected AppComponent createAppComponent(){
        return DaggerAppComponent.builder()
                .application(this)
                .build();
    }

    @Override
    protected void initAnalytics() {
        //Disable analytics
    }
}
