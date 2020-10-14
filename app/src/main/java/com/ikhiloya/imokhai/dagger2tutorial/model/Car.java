package com.ikhiloya.imokhai.dagger2tutorial.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    //    @Inject
//    Engine engine; //field injection
    private Wheels wheels;


    //Order of Execution is Constructor---> field--->Method Injection
    //THe constructor injection triggers the other injection in the class

    @Inject //Constructor injection: tells Dagger2 how to create an instance of the Car class
    //so Dagger provides and object of Engine and Wheels when it is needed
//    public Car(/*Engine engine, **/ Wheels wheels) {
//        /* this.engine = engine; **/
//        this.wheels = wheels;
//    }

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject  // use method injection when you want to inject the class as a reference.
    // This ensures that the class has been fully constructed before using it's instance
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving");
    }

}
