package com.example.mobsoft.mobsoftlab3.ui.createevent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public interface CreateEventScreen {
	void showMessage(String text);
	void createEvent(String name, String place, List<String> prerequisites);
}
