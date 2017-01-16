package com.lea.home.homes.services;

import com.lea.home.homes.dao.TiketDao;
import com.lea.home.homes.impl.TiketDaoImpl;

/**
 * Created by User on 12.01.2017.
 */
public class UserService {

    UserService () {}

    // получения id юзера
    public void getById () {

    }
//---------------------------------------------------------------------------------
    public String getUserByEmail (String name) {
        return "email";
    }
    public String getUserByEmail (long id) {
        return "email";
    }
//---------------------------------------------------------------------------------

    public String getUsersByName (String email) {
        return "name user";
    }


//    public TiketDao getBookedTickets (String name) {
//        return new TiketDaoImpl();
//    }

}
