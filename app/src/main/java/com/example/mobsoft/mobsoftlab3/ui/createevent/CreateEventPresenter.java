package com.example.mobsoft.mobsoftlab3.ui.createevent;

import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.EventInteractor;
import com.example.mobsoft.mobsoftlab3.ui.Presenter;
import com.example.mobsoft.mobsoftlab3.ui.main.MainScreen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static com.example.mobsoft.mobsoftlab3.MobSoftApplication.injector;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class CreateEventPresenter extends Presenter<CreateEventScreen> {
	public CreateEventPresenter() {
    }

    @Inject
    EventInteractor eventInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(CreateEventScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }



	public void createEvent(String name, String place, List<String> prerequisites){}

}
