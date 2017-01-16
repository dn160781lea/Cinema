package com.lea.home.homes.dao;

import com.lea.home.homes.moduls.Event;

/**
 * Created by User on 13.01.2017.
 */
public interface EventDao {
    void add (Event event);
    void delete (Event event);
    Event get (String date, String time);
    boolean update (Event oldEvent, Event newEvent) ;
}
