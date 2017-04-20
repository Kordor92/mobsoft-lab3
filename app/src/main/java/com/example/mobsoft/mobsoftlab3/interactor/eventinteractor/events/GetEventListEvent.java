package com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.events;

import com.example.mobsoft.mobsoftlab3.model.Event;

import java.util.List;

/**
 * Created by Jozso on 2017. 04. 20..
 */

public class GetEventListEvent {
    private int code;
    private List<Event> events;
    private Throwable throwable;

    public GetEventListEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
