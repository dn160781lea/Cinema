package com.lea.pro;

/**
 * Created by User on 10.01.2017.
 */
public class AppProp {
    private String namePort;
    private String nameDoc;

    public String getNamePort() {
        return namePort;
    }

    public void setNamePort(String namePort) {
        this.namePort = namePort;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public void print () {
        System.out.println("namePort="+namePort+",  nameDoc="+nameDoc);
    }

}
