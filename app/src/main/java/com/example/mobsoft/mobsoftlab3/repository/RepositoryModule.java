package com.example.mobsoft.mobsoftlab3.repository;

/**
 * Created by Jozso on 2017. 04. 20..
 */

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    public Repository provideRepository() {
        return new SugarOrmRepository();
    }
}