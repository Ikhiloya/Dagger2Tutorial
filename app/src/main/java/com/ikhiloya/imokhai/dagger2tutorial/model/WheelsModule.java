package com.ikhiloya.imokhai.dagger2tutorial.model;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    //use static keyword if there's no dependency on an instance
    //also, static increases performance by reducing multiple instantiation by Dagger
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }


    //By this time, Dagger already knows how to create Rims and Tyres
    @Provides
    static Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }


}
