package com.ikhiloya.imokhai.dagger2tutorial;

import android.app.Application;

import com.ikhiloya.imokhai.dagger2tutorial.dagger.AppComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.DaggerAppComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.DriverModule;

public class ExampleApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory().create(new DriverModule("John"));
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
