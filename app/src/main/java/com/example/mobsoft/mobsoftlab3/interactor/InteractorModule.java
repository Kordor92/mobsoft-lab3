package com.example.mobsoft.mobsoftlab3.interactor;

/**
 * Created by Jozso on 2017. 04. 20..
 */

import dagger.Module;
import dagger.Provides;
import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.EventInteractor;

@Module
public class InteractorModule {

    @Provides
    public EventInteractor provideEvents() {
        return new EventInteractor();
    }


}
