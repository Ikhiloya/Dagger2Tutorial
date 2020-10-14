package com.ikhiloya.imokhai.dagger2tutorial;

import android.app.Application;

import com.ikhiloya.imokhai.dagger2tutorial.dagger.CarComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.DaggerCarComponent;

public class ExampleApp extends Application {
    private CarComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        carComponent = DaggerCarComponent.builder()
                .horsePower(200)
                .engineCapacity(2909)
                .build();
    }


    public CarComponent getAppComponent() {
        return carComponent;
    }
}
