package com.example.mobsoft.mobsoftlab3.ui.joinevent;

import com.example.mobsoft.mobsoftlab3.ui.Presenter;
import com.example.mobsoft.mobsoftlab3.ui.main.MainScreen;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class JoinEventPresenter extends Presenter<JoinEventScreen> {

    public JoinEventPresenter() {
    }

	@Override
    public void attachScreen(JoinEventScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
	
    public void joinEvent(String name, String phone, String role){}
	
	
    public void showEventDetails(String eventName, String eventPlace, String[] eventRoles){}
}