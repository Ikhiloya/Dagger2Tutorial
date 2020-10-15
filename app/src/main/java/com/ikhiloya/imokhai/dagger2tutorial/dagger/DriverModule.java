package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import com.ikhiloya.imokhai.dagger2tutorial.model.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
        //ensures that the Driver instance is a singleton
    Driver provideDriver() {
        return new Driver(driverName);
    }
}
