package com.example.mobsoft.mobsoftlab3;

/**
 * Created by mobsoft on 2017. 03. 24..
 */
import javax.inject.Inject;
import android.app.Application;
import com.example.mobsoft.mobsoftlab3.repository.Repository;
import com.example.mobsoft.mobsoftlab3.ui.UIModule;


public class MobSoftApplication extends Application {
    @Inject
    Repository repository;

    public static MobSoftApplicationComponent injector;

    public void setInjector(MobSoftApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }
    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
        injector.inject(this);
        repository.open(getApplicationContext());
    }
}