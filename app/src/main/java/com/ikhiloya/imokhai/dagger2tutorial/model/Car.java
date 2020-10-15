package com.ikhiloya.imokhai.dagger2tutorial.model;

import android.util.Log;

import com.ikhiloya.imokhai.dagger2tutorial.dagger.PerActivity;

import javax.inject.Inject;

//here we want to make the Car class a singleton within an activity-scope
//It tells Dagger to create a single instance of Car within the same component
@PerActivity
public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    private Engine engine;
    //    @Inject
//    Engine engine; //field injection
    private Wheels wheels;


    //Order of Execution is Constructor---> field--->Method Injection
    //THe constructor injection triggers the other injection in the class

    //    @Inject //Constructor injection: tells Dagger2 how to create an instance of the Car class
    //so Dagger provides and object of Engine and Wheels when it is needed
//    public Car(/*Engine engine, **/ Wheels wheels) {
//        /* this.engine = engine; **/
//        this.wheels = wheels;
//    }
    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject  // use method injection when you want to inject the class as a reference.
    // This ensures that the class has been fully constructed before using it's instance
    public void enableRemote(Remote remote) {
        engine.start();
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, driver + " is driving " + this);
    }

}
