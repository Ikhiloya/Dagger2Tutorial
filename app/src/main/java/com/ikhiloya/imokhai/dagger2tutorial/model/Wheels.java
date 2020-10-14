package com.ikhiloya.imokhai.dagger2tutorial.model;

import javax.inject.Inject;

public class Wheels {
    //Assuming we don't own this class.
    //So we can't annotate it with @Inject

    private Rims rims;
    private Tyres tyres;

//    @Inject
//    public Wheels() {
//    }


    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
