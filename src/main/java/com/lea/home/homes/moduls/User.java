package com.lea.home.homes.moduls;

import java.util.Date;

/**
 * Created by User on 11.01.2017.
 */
public class User {
    // для автоматизации id нужно убрать заполнение id руками
    private long id;
    private String name;
    private String surname;
    private String e_mail;
    //private Date birghDay;
    private String birghDay;

    public User () {
    }

    public User(long id, String name, String surname, String e_mail, String birghDay) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.e_mail = e_mail;
        this.birghDay = birghDay;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

//    public Date getBirghDay() {
//        return birghDay;
//    }
//
//    public void setBirghDay(Date birghDay) {
//        this.birghDay = birghDay;
//    }

    public String getBirghDay() {
        return birghDay;
    }

    public void setBirghDay(String birghDay) {
        this.birghDay = birghDay;
    }
}
