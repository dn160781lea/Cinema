package com.lea.home.homes;

import com.lea.home.homes.impl.AuditoriumDaoImpl;
import com.lea.home.homes.impl.EventDaoImpl;
import com.lea.home.homes.impl.UserDaoImpl;
import com.lea.home.homes.moduls.Event;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by User on 11.01.2017.
 */
public class Main {
    public static void main(String[] args) {
//        User user = new User(777, "John", "Jonnatan", "skiff@ua.fm", "16.07.2000");

//        List <User> list = new ArrayList<>();
//
//        UserDao userDao = new UserDaoImpl (list);
//
//        userDao.create(new User(777, "John", "Jonnatan", "skiff@ua.fm", "16.07.2000")) ;
//        userDao.create(new User(777, "Rex", "Smith", "rex@ua.fm", "01.08.1988")) ;
//
//
//        userDao.printAllUser();

        GenericXmlApplicationContext gac = new GenericXmlApplicationContext();
        gac.load("cinema/cin.xml");
        gac.refresh();
//----------------------- ЮЗЕРЫ
        UserDaoImpl userDao = gac.getBean("userDaoImpl", UserDaoImpl.class);
        userDao.printAllUser();
//-----------------------------


//----------------------- КИНOЗАЛЫ

        AuditoriumDaoImpl auditoriumDao = gac.getBean("AuditoriumDaoImpl", AuditoriumDaoImpl.class);


        String nameAuditorium = auditoriumDao.getNameAuditorium();
        String seatsNumberAuditorium = auditoriumDao.getSeatsNumberAuditorium();
        String seatsVipNumber = auditoriumDao.getSeatsVipNumber();

            System.out.println("nameAuditorium="+nameAuditorium+", seatsNumberAuditorium, "+seatsNumberAuditorium+
                                ", seatsVipNumber "+seatsVipNumber);

        System.out.println("--------");
//------------------------------

        EventDaoImpl eventDaoImpl = gac.getBean("eventDaoImpl", EventDaoImpl.class);
        List<Event> eventList = eventDaoImpl.list;

        for (Event event: eventList) {
            System.out.print (event.toString());
            System.out.println();
        }



    }
}
