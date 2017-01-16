package com.lea.home.homes.impl;

import com.lea.home.homes.dao.UserDao;
import com.lea.home.homes.moduls.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.01.2017.
 */

// реализация интерфейса
public class UserDaoImpl implements UserDao {
    User user;
    List <User> list ;

    UserDaoImpl () {}

    UserDaoImpl (List list) {
        this.list=list;
    }

    public long create (User user) {
        list.add(user);

        return 1;
    }
    public void update (User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean delete (User user){
        return false;
    }

    public User find (long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

//----------------------------------------------------------------------

    public void printAllUser () {
        for (User users: list) {
            System.out.println(
                            "id:"+users.getId()+
                            "  Name:"+users.getName()+
                            "  Surname:"+users.getSurname()+
                            "  BirghDay:"+users.getBirghDay()+
                            "  E_mail:"+users.getE_mail()

            );
        }
    }

}
