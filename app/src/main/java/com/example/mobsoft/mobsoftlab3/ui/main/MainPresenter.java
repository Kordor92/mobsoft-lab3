package com.example.mobsoft.mobsoftlab3.ui.main;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import com.example.mobsoft.mobsoftlab3.ui.Presenter;
import java.util.concurrent.Executor;
import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.EventInteractor;
import javax.inject.Inject;
import com.example.mobsoft.mobsoftlab3.model.Event;

import static com.example.mobsoft.mobsoftlab3.MobSoftApplication.injector;

import de.greenrobot.event.EventBus;
/**
 * Created by Patrik on 2017. 03. 19..
 */

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    EventInteractor eventInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    public MainPresenter() {
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }

    public void navigate(int nextScreen){}
}
