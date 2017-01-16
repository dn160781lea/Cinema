package com.lea.home.homes.dao;

import com.lea.home.homes.moduls.Event;
import com.lea.home.homes.moduls.Ticket;

/**
 * Created by User on 12.01.2017.
 */
public interface TiketDao {
    void add (Ticket tiket);
    Ticket get (Event event);
    Ticket get (long idTiket);
    void delete (long idTiket);

}
