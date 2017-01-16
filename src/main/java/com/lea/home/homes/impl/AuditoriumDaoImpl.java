package com.lea.home.homes.impl;

import com.lea.home.homes.dao.AuditoriumDao;

/**
 * Created by User on 11.01.2017.
 */
public class AuditoriumDaoImpl implements AuditoriumDao {
    private String nameAuditorium;
    private String seatsNumberAuditorium;
    private String seatsVipNumber;

    public String getNameAuditorium() {
        return nameAuditorium;
    }

    public void setNameAuditorium(String nameAuditorium) {
        this.nameAuditorium = nameAuditorium;
    }

    public String getSeatsNumberAuditorium() {
        return seatsNumberAuditorium;
    }

    public void setSeatsNumberAuditorium(String seatsNumberAuditorium) {
        this.seatsNumberAuditorium = seatsNumberAuditorium;
    }

    public String getSeatsVipNumber() {
        return seatsVipNumber;
    }

    public void setSeatsVipNumber(String seatsVipNumber) {
        this.seatsVipNumber = seatsVipNumber;
    }
}
