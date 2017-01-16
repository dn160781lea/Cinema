package com.lea.home.homes.impl;

import com.lea.home.homes.dao.EventDao;
import com.lea.home.homes.moduls.Event;

import java.util.List;

/**
 * Created by User on 13.01.2017.
 */
public class EventDaoImpl implements EventDao {
    public List <Event> list;

    EventDaoImpl () {}

    EventDaoImpl (List<Event> list) {
        this.list=list;
    }

//-----------------------------------------------------------------------------------------------------------

    public void add (Event event) {
        list.add(event);
    }

    public void delete (Event event) {
        list.remove(event);
    }
//----------------------------------------------------------------------------------------------------
    public Event get (String date, String time) {
        for (Event event: list) {
            if ((event.getDateCinema().equals(date)) && ( event.getTimeCinema().equals(time)) ) {
                return event;
            }
        }
        return null;
    }
//----------------------------------------------------------------------------------------------------
    // переопределить equls ();
     public boolean update (Event oldEvent, Event newEvent) {
        for (Event event: list) {
            if (oldEvent.equals(event) ) {
                delete(oldEvent);
                break;
            }
            else {
                System.out.println("событие для удаление не найдно. " +
                                  "Добавление нового произведено без уделения.");
            }
        }
        add(newEvent);
        return true;
    }
//----------------------------------------------------------------------------------------------------


}
