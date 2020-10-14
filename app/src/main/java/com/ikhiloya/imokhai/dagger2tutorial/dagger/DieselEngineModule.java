package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import com.ikhiloya.imokhai.dagger2tutorial.model.DieselEngine;
import com.ikhiloya.imokhai.dagger2tutorial.model.Engine;
import com.ikhiloya.imokhai.dagger2tutorial.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    //To reduce the verbosity of this module, we turn it to an abstract class and bind the engine
    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
