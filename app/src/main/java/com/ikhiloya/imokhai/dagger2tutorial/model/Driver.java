package com.ikhiloya.imokhai.dagger2tutorial.model;

import javax.inject.Inject;
import javax.inject.Singleton;

//@Singleton
public class Driver {
    //Assuming we don't own this class.
    //So we can't annotate it with @Inject

//    @Inject
//    public Driver() {
//    }


    String name;

    public Driver(String name) {
        this.name = name;
    }
}
