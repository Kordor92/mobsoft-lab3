package com.example.mobsoft.mobsoftlab3.ui.joinevent;

import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.EventInteractor;
import com.example.mobsoft.mobsoftlab3.ui.Presenter;
import com.example.mobsoft.mobsoftlab3.ui.main.MainScreen;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static com.example.mobsoft.mobsoftlab3.MobSoftApplication.injector;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class JoinEventPresenter extends Presenter<JoinEventScreen> {

    public JoinEventPresenter() {
    }

    @Inject
    EventInteractor eventInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

	@Override
    public void attachScreen(JoinEventScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }
	
    public void joinEvent(String name, String phone, String role){}
	
	
    public void showEventDetails(String eventName, String eventPlace, String[] eventRoles){}
}