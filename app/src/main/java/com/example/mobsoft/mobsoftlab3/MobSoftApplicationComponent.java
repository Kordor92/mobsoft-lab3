package com.example.mobsoft.mobsoftlab3;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import javax.inject.Singleton;

import dagger.Component;
import com.example.mobsoft.mobsoftlab3.ui.UIModule;
import com.example.mobsoft.mobsoftlab3.ui.main.MainActivity;
import com.example.mobsoft.mobsoftlab3.ui.joinevent.JoinEventActivity;
import com.example.mobsoft.mobsoftlab3.ui.events.EventActivity;
import com.example.mobsoft.mobsoftlab3.ui.createevent.CreateEventActivity;

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(JoinEventActivity joinEventActivity);
	void inject(EventActivity eventActivity);
	void inject(CreateEventActivity createEventActivity);
}
