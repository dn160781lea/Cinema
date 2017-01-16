package com.lea.home.homes.moduls;

/**
 * Created by User on 12.01.2017.
 */
public class Event {
    private String nameCinema;
    private String nameAuditoriumCinema;
    private String timeCinema;
    private String dateCinema;
//---------------------------------------------------------------------------------------------
    public Event () {}

    public Event(String nameCinema, String nameAuditoriumCinema, String timeCinema, String dateCinema) {
        this.nameCinema = nameCinema;
        this.nameAuditoriumCinema = nameAuditoriumCinema;
        this.timeCinema = timeCinema;
        this.dateCinema = dateCinema;
    }
//-------------------------------------------------------------------------------------------


    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

//--------------------------------------------------------------------------------------------

    public String getNameAuditoriumCinema() {
        return nameAuditoriumCinema;
    }

    public void setNameAuditoriumCinema(String nameAuditoriumCinema) {
        this.nameAuditoriumCinema = nameAuditoriumCinema;
    }

//--------------------------------------------------------------------------------------------

    public String getTimeCinema() {
        return timeCinema;
    }

    public void setTimeCinema(String timeCinema) {
        this.timeCinema = timeCinema;
    }
//--------------------------------------------------------------------------------------------
    public String getDateCinema() {
        return dateCinema;
    }

    public void setDateCinema(String dateCinema) {
        this.dateCinema = dateCinema;
    }

    public String toString () {
        return "  "+nameCinema+"  "+nameAuditoriumCinema+"   "+timeCinema+"  "+dateCinema;
    }
}
