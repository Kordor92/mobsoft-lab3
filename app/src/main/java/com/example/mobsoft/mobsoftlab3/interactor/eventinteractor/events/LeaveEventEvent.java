package com.example.mobsoft.mobsoftlab3.interactor.eventinteractor.events;

import com.example.mobsoft.mobsoftlab3.model.Event;

/**
 * Created by Jozso on 2017. 04. 20..
 */

public class LeaveEventEvent {
    private int code;
    private Event event;
    private Throwable throwable;

    public LeaveEventEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
