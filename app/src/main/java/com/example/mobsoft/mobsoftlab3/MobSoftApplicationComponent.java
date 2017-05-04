package com.example.mobsoft.mobsoftlab3;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import javax.inject.Singleton;

import dagger.Component;

import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.EventInteractor;
import com.example.mobsoft.mobsoftlab3.io.swagger.client.api.DefaultApi;
import com.example.mobsoft.mobsoftlab3.network.NetworkModule;
import com.example.mobsoft.mobsoftlab3.ui.UIModule;
import com.example.mobsoft.mobsoftlab3.ui.createevent.CreateEventPresenter;
import com.example.mobsoft.mobsoftlab3.ui.events.EventPresenter;
import com.example.mobsoft.mobsoftlab3.ui.joinevent.JoinEventPresenter;
import com.example.mobsoft.mobsoftlab3.ui.main.MainActivity;
import com.example.mobsoft.mobsoftlab3.ui.joinevent.JoinEventActivity;
import com.example.mobsoft.mobsoftlab3.ui.events.EventActivity;
import com.example.mobsoft.mobsoftlab3.ui.createevent.CreateEventActivity;
import com.example.mobsoft.mobsoftlab3.repository.RepositoryModule;
import com.example.mobsoft.mobsoftlab3.interactor.InteractorModule;
import com.example.mobsoft.mobsoftlab3.ui.main.MainPresenter;

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class, NetworkModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(JoinEventActivity joinEventActivity);
	void inject(EventActivity eventActivity);
	void inject(CreateEventActivity createEventActivity);
    void inject(RepositoryModule repositoryModule);
    void inject(MobSoftApplication mobSoftApplication);
    void inject(EventInteractor eventInteractor);
    void inject(MainPresenter mainPresenter);
    void inject(CreateEventPresenter createEventPresenter);
    void inject(EventPresenter eventPresenter);
    void inject(JoinEventPresenter joinEventPresenter);
    void inject(DefaultApi defaultApi);

}
