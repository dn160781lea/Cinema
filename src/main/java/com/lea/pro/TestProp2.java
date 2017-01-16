package com.lea.pro;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by User on 10.01.2017.
 */
public class TestProp2 {
    public static void main(String[] args) {
        GenericXmlApplicationContext gac = new GenericXmlApplicationContext();
        gac.load("prop.sp/prop.xml");
        gac.refresh();

        AppProp appProp= gac.getBean("appProp", AppProp.class);

        appProp.print();

    }
}
