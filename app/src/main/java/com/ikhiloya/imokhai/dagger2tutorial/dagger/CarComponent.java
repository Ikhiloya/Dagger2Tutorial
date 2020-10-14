package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import com.ikhiloya.imokhai.dagger2tutorial.MainActivity;
import com.ikhiloya.imokhai.dagger2tutorial.model.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
//Access point- Used to access the dependency graph. Without which Dagger wouldn't work
public interface CarComponent {
    //tells Dagger2 that we want to have a fully functional/constructed Car provided by Dagger
    //Dagger automatically creates the implementation of this interface method through ANNOTATION PROCESSING
    //hence we annotated this interface with [@Component]
    Car getCar();

    void inject(MainActivity mainActivity);

    //overrides the default Dagger Builder pattern
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);


        CarComponent build();
    }
}
