package com.example.mobsoft.mobsoftlab3.ui.joinevent;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public interface JoinEventScreen {
    void showMessage(String text);
    void joinEvent(String name, String Phone, String role);
    void showEventDetails(String eventName, String eventPlace, String[] eventRoles);
}
