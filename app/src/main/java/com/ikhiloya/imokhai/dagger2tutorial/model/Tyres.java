package com.ikhiloya.imokhai.dagger2tutorial.model;

import android.util.Log;

public class Tyres {
    private static final String TAG = "Car";
    //Assuming we don't own this class.
    //So we can't annotate it with @Inject


    public void inflate() {
        Log.d(TAG, "Tyres inflated");
    }
}
