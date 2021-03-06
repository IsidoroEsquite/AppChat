package org.isidoro.app.messenger.contactlist.events;

import org.isidoro.app.messenger.entities.User;

/**
 * Created by avalo.
 */
public class ContactListEvent {
    public static final int onContactAdded = 0;
    public static final int onContactChanged = 1;
    public static final int onContactRemoved = 2;

    private User user;
    private int eventType;

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public int getEventType(){
        return eventType;
    }

    public void setEventType(int eventType){
        this.eventType = eventType;
    }
}
