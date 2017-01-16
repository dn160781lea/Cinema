package com.lea.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by User on 10.01.2017.
 */
public class TestPropert {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        File file = new File("src/main/resources/mdf.properties");
        System.out.println(file.toString());
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("names"));



//        int c;
//        while ((c=(char) fileInputStream.read()) !=0 ) {
//            System.out.print(c);
//        }

    }
}
