package com.example.mobsoft.mobsoftlab3.ui.createevent;

import com.example.mobsoft.mobsoftlab3.ui.Presenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class CreateEventPresenter extends Presenter<CreateEventScreen> {
	public CreateEventPresenter() {
    }

    @Override
    public void attachScreen(CreateEventScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
	
	public void createEvent(String name, String place, List<String> prerequisites){}

}
