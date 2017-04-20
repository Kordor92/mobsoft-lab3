package com.example.mobsoft.mobsoftlab3.interactor.eventinteractor;

/**
 * Created by Jozso on 2017. 04. 20..
 */
import java.util.List;

import javax.inject.Inject;
import de.greenrobot.event.EventBus;
import com.example.mobsoft.mobsoftlab3.repository.Repository;
import com.example.mobsoft.mobsoftlab3.MobSoftApplication;
import com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.events.*;
import com.example.mobsoft.mobsoftlab3.model.Event;

public class EventInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public EventInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void getEventList() {
        GetEventListEvent event = new GetEventListEvent();
        try {
            List<Event> events = repository.getEvents();
            event.setEvents(events);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void getMyEvents() {
        GetMyEventsEvent event = new GetMyEventsEvent();
        try {
            List<Event> events = repository.getMyEvents();
            event.setEvents(events);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }

    }

    public void joinEvent(Event ev){

        JoinEventEvent event = new JoinEventEvent();
        event.setEvent(ev);
        try {
            repository.joinEvent(ev);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void leaveEvent(Event ev){

        LeaveEventEvent event = new LeaveEventEvent();
        event.setEvent(ev);
        try {
            repository.leaveEvent(ev);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }


    public void deleteEvent(Event ev) {
        DeleteEventEvent event = new DeleteEventEvent();
        event.setEvent(ev);
        try {
            repository.removeEvent(ev);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
