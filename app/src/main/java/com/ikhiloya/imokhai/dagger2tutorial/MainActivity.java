package com.ikhiloya.imokhai.dagger2tutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ikhiloya.imokhai.dagger2tutorial.dagger.CarComponent;
import com.ikhiloya.imokhai.dagger2tutorial.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //Field Injection
    //As a general rule: field Injection is for Framework types that the android system instantiates like the Activities and Fragments
    @Inject
    public Car car1, car2;

//    private Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CarComponent carComponent = DaggerCarComponent.create();
//        CarComponent carComponent = DaggerCarComponent
//                .builder()
//                .horsePower(1000)
//                .engineCapacity(500)
//                .build();
//        car = carComponent.getCar();

        CarComponent carComponent = ((ExampleApp) getApplication()).getAppComponent();
        carComponent.inject(this);
        car1.drive();
        car2.drive();
    }
}
