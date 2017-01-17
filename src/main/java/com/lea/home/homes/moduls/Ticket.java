package com.lea.home.homes.moduls;

/**
 * Created by User on 13.01.2017.
 */
public class Ticket {
    // getEvent
    // getUser
    // get Текущий день
    static private long idTiket=1000000;
    private Event event;
    private User user;
    private String userName;
    private String userSurname;
    private long userID;

//----------------------------------------------------------------------------------------------------------------------



//---------------------------------------------------------------------------------------------------


    public static long getIdTiket() {
        return idTiket;
    }

    public Event getEvent() {
        idTiket++;
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
