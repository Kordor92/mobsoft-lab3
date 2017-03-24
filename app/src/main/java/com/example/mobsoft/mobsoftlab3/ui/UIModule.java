package com.example.mobsoft.mobsoftlab3.ui;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import android.content.Context;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.example.mobsoft.mobsoftlab3.ui.main.MainPresenter;
import com.example.mobsoft.mobsoftlab3.ui.joinevent.JoinEventPresenter;

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public JoinEventPresenter provideJoinEventPresenter() {
        return new JoinEventPresenter();
    }

}