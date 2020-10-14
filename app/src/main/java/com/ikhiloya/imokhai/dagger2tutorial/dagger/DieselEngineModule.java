package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import com.ikhiloya.imokhai.dagger2tutorial.model.DieselEngine;
import com.ikhiloya.imokhai.dagger2tutorial.model.Engine;
import com.ikhiloya.imokhai.dagger2tutorial.model.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    @Provides
    Engine DieselPetrolEngine(PetrolEngine petrolEngine) {
        return new DieselEngine();
    }
}
