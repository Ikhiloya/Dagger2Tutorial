package com.ikhiloya.imokhai.dagger2tutorial.di;

import com.ikhiloya.imokhai.dagger2tutorial.MainActivity;
import com.ikhiloya.imokhai.dagger2tutorial.model.Car;
import com.ikhiloya.imokhai.dagger2tutorial.model.WheelsModule;

import dagger.Component;

@Component(modules = WheelsModule.class) //Access point- Used to access the dependency graph. Without which Dagger wouldn't work
public interface CarComponent {
    //tells Dagger2 that we want to have a fully functional/constructed Car provided by Dagger
    //Dagger automatically creates the implementation of this interface method through ANNOTATION PROCESSING
    //hence we annotated this interface with [@Component]
    Car getCar();

    void inject(MainActivity mainActivity);
}
