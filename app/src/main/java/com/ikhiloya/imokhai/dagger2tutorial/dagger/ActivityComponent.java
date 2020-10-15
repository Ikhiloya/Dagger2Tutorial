package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import com.ikhiloya.imokhai.dagger2tutorial.MainActivity;
import com.ikhiloya.imokhai.dagger2tutorial.model.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

/**
 * This component is annotated with {@link PerActivity} to show that it is an Activity component
 */
@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
//Access point- Used to access the dependency graph. Without which Dagger wouldn't work
public interface ActivityComponent {
    //tells Dagger2 that we want to have a fully functional/constructed Car provided by Dagger
    //Dagger automatically creates the implementation of this interface method through ANNOTATION PROCESSING
    //hence we annotated this interface with [@Component]
    Car getCar();

    void inject(MainActivity mainActivity);

    //overrides the default Dagger Builder pattern
    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        //Here, we have to explicitly define the setter method on the interface since we created our Component Builder
        // otherwise it is created by default
//        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }
}
