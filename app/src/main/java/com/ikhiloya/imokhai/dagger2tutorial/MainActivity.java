package com.ikhiloya.imokhai.dagger2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ikhiloya.imokhai.dagger2tutorial.dagger.CarComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.DaggerCarComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.DieselEngineModule;
import com.ikhiloya.imokhai.dagger2tutorial.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //Field Injection
    //As a general rule: field Injection is for Framework types that the android system instantiates like the Activities and Fragments
    @Inject
    public Car car;

//    private Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CarComponent carComponent = DaggerCarComponent.create();
        CarComponent carComponent = DaggerCarComponent
                .builder()
                .dieselEngineModule(new DieselEngineModule(90000))
                .build();
//        car = carComponent.getCar();
        carComponent.inject(this);
        car.drive();
    }
}
