package com.example.mobsoft.mobsoftlab3.model;

/**
 * Created by Jozso on 2017. 04. 20..
 */
import java.util.*;

public class Event{
    private int eventID;
    private String name;
    private String description;
    private String location;
    private int numberOfPlayers;
    private List<String> prerequisites;
    private String owner;

    public Event(int eventID, String name, String description, String location, int numberOfPlayers, List<String> prerequisites, String owner) {
        this.eventID = eventID;
        this.name = name;
        this.description = description;
        this.location = location;
        this.numberOfPlayers = numberOfPlayers;
        this.prerequisites = prerequisites;
        this.owner = owner;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}
