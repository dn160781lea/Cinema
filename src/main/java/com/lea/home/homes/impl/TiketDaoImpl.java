package com.lea.home.homes.impl;

import com.lea.home.homes.dao.TiketDao;
import com.lea.home.homes.moduls.Event;
import com.lea.home.homes.moduls.Ticket;

import java.util.List;

/**
 * Created by User on 12.01.2017.
 */
public class TiketDaoImpl implements TiketDao {
    List<Ticket> list;

    TiketDaoImpl (List <Ticket> list) {
        this.list=list;
    }
//------------------------------------------------------------------------------
    @Override
    public void add(Ticket tiket) {
        list.add(tiket);
    }
//------------------------------------------------------------------------------
    @Override
    public Ticket get(Event event) {
        return null;
    }
//------------------------------------------------------------------------------
    @Override
    public Ticket get(long idTiket) {

        for (Ticket t: list) {
            if (t.getIdTiket() == idTiket) {
            return t;
            }

        }
        return null;
    }
//-------------------------------------------------------------------------------------------
    @Override
    public void delete(long idTiket) {
        for (Ticket t: list) {
            if (t.getIdTiket() == idTiket) {
                list.remove(t);
                break;
            }
        }
    }
//-------------------------------------------------------------------------------------------



}
