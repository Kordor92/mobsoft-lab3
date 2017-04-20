package com.example.mobsoft.mobsoftlab3.repository;

/**
 * Created by Jozso on 2017. 04. 20..
 */

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

import com.example.mobsoft.mobsoftlab3.model.Event;

public class SugarOrmRepository implements Repository {


    @Override
    public void open(Context context){
        SugarContext.init(context);
    }
    @Override
    public void close(){
        SugarContext.terminate();
    }

    @Override
    public List<Event> getEvents(){
        return SugarRecord.listAll(Event.class);
    }

    @Override
    public Event getEvent(int eventID){
        return SugarRecord.findById(Event.class, eventID);
    }

    @Override
    public List<Event> getMyEvents(){
        List<Event> all = new ArrayList<Event>();
        all =  SugarRecord.listAll(Event.class);
        List<Event> buffer = new ArrayList<Event>();
        for (Event event : all) {
            if (event.getOwner().equals("X")) {
                buffer.add(event);
            }
        }
        return buffer;
    }

    @Override
    public void createEvent(int eventID, String name, String description, String location, int numberOfPlayers, List<String> prerequisites){
        Event event = new Event(eventID, name, description, location, numberOfPlayers,prerequisites, "");
        SugarRecord.saveInTx(event);
    }

    @Override
    public void removeEvent(Event event){
        SugarRecord.deleteInTx(event);
    }

    @Override
    public boolean isInDB(Event event){
        return SugarRecord.findById(Event.class, event.getEventID()) != null;
    }


    @Override
    public void joinEvent(Event ev){
        List<Event> all = new ArrayList<Event>();
        all =  SugarRecord.listAll(Event.class);
        for (Event event : all) {
            if (event.getEventID() == ev.getEventID()) {
                event.setOwner("X");
                SugarRecord.saveInTx(event);
            }
        }
    }

    @Override
    public void leaveEvent(Event ev){
        List<Event> all = new ArrayList<Event>();
        all =  SugarRecord.listAll(Event.class);
        for (Event event : all) {
            if (event.getEventID() == ev.getEventID()) {
                event.setOwner("");
                SugarRecord.saveInTx(event);
            }
        }

    }
}
