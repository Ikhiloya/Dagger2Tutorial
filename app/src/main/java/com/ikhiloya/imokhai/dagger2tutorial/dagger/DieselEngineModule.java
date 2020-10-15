package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import android.util.Log;

import com.ikhiloya.imokhai.dagger2tutorial.model.DieselEngine;
import com.ikhiloya.imokhai.dagger2tutorial.model.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private static final String TAG = "DieselEngineModule";
    private int horsePower;


    public DieselEngineModule(int horsePower) {
        Log.d(TAG, "DieselEngineModule: ");
        this.horsePower = horsePower;
    }

    @Provides
    public int provideHorsePower() {
        Log.d(TAG, "provideHorsePower: ");
        return horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine engine) {
        Log.d(TAG, "providesEngine: ");
        return engine;
    }
}
