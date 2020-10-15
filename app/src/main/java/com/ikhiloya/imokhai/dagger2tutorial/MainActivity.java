package com.ikhiloya.imokhai.dagger2tutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ikhiloya.imokhai.dagger2tutorial.dagger.ActivityComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.AppComponent;
import com.ikhiloya.imokhai.dagger2tutorial.dagger.DieselEngineModule;
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
//        AppComponent appComponent = ((ExampleApp) getApplication()).getAppComponent();
//        ActivityComponent activityComponent = ((ExampleApp) getApplication()).getAppComponent()
//                .getActivityComponent(new DieselEngineModule(222));


//        ActivityComponent activityComponent = ((ExampleApp) getApplication()).getAppComponent()
//                .getActivityComponentBuilder()
//                .horsePower(333)
//                .engineCapacity(999)
//                .build();

        ActivityComponent activityComponent = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory()
                .create(4747, 8834);


//        ActivityComponent activityComponent = DaggerActivityComponent.builder()
//                .horsePower(333)
//                .engineCapacity(222)
//                .appComponent(appComponent)
//                .build();

        activityComponent.inject(this);
        car1.drive();
        car2.drive();
    }
}
