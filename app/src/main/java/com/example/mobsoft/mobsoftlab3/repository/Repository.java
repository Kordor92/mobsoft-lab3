package com.example.mobsoft.mobsoftlab3.repository;

import android.content.Context;

import com.example.mobsoft.mobsoftlab3.model.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jozso on 2017. 04. 20..
 */

public interface Repository {


    public void open(Context context);
    public void close();
    public List<Event> getEvents();
    public Event getEvent(int eventID);
    public List<Event> getMyEvents();
    public void createEvent(int eventID, String name, String description, String location, int numberOfPlayers, List<String> prerequisites);
    public void removeEvent(Event event);
    public boolean isInDB(Event event);
    public void joinEvent(Event event);
    public void leaveEvent(Event event);

}
