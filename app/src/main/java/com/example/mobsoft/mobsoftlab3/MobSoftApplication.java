package com.example.mobsoft.mobsoftlab3;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import android.app.Application;

import com.example.mobsoft.mobsoftlab3.ui.UIModule;

public class MobSoftApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}