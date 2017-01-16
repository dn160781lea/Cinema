package com.lea.home.homes.dao;

import com.lea.home.homes.moduls.User;

/**
 * Created by User on 11.01.2017.
 */
public interface UserDao {
    long create (User user);
    void update (User user);
    boolean delete (User user);
    User find (long id);

    void printAllUser (); // проверочный
}
