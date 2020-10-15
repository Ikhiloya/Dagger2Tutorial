package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import com.ikhiloya.imokhai.dagger2tutorial.model.Driver;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Component;

//This is responsible for creating the Driver instance once per application
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

//    Driver getDriver();

    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);


}
