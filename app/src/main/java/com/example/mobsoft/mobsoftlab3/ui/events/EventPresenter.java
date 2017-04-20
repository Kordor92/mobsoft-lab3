package com.example.mobsoft.mobsoftlab3.ui.events;

import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.EventInteractor;
import com.example.mobsoft.mobsoftlab3.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static com.example.mobsoft.mobsoftlab3.MobSoftApplication.injector;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class EventPresenter extends Presenter<EventScreen> {


    public EventPresenter() {
    }

    @Inject
    EventInteractor eventInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(EventScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }
	
	public void showEvents(){}
	
	public void showMyEvents(){}

}
