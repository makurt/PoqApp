package com.poqstudio.app.client.test.runner;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

import com.poqstudio.app.client.TestPoqApplication;

/**
 * @deprecated This class should be provided by platform
 */
@Deprecated
public class TestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, TestPoqApplication.class.getName(), context);
    }
}
