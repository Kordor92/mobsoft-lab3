package com.example.mobsoft.mobsoftlab3.repository;

/**
 * Created by Jozso on 2017. 04. 20..
 */
import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.mobsoft.mobsoftlab3.model.Event;

public class MemoryRepository implements Repository {


    public static List<Event> events;

    @Override
    public void open(Context context) {
        List<String> proba1 = new ArrayList<>();
        List<String> proba2 = new ArrayList<>();
        proba1.add("harcos");
        proba2.add("parázsló");
        Event event1 = new Event(1, "event1", "proba1", "1L",5, proba1, "X");
        Event event2 = new Event(2, "event2", "proba2", "1L",3, proba2, "");

        events = new ArrayList<>();
        events.add(event1);
        events.add(event2);
    }

    @Override
    public void close() {

    }

    @Override
    public List<Event> getEvents() {
        return events;
    }

    @Override
    public Event getEvent(int eventID) {
        for (Event event : events) {
            if (event.getEventID() == eventID) {
                return event;
            }
        }
        return null;
    }

    @Override
    public List<Event> getMyEvents() {
        List<Event> buffer = new ArrayList<Event>();
        for (Event event : events) {
            if (event.getOwner().equals("X")) {
                buffer.add(event);
            }
        }
        return buffer;
    }

    @Override
    public void createEvent(int eventID, String name, String description, String location, int numberOfPlayers, List<String> prerequisites) {
        events.add(new Event(eventID, name, description, location, numberOfPlayers, prerequisites, ""));
    }


    @Override
    public void removeEvent(Event event) {
        events.remove(event);
    }

    @Override
    public boolean isInDB(Event event) {
        return events.contains(event);
    }

    @Override
    public void joinEvent(Event ev){
        for (Event event : events) {
            if (event.getEventID() == ev.getEventID()) {
                event.setOwner("X");
            }
        }
    }

    @Override
    public void leaveEvent(Event ev){
        for (Event event : events) {
            if (event.getEventID() == ev.getEventID()) {
                event.setOwner("");
            }
        }
    }

}
