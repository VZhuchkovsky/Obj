package com.hillel.com.hillel.property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by VZhuchkovsky on 04.06.2015.
 */
public class PropertyMain {
    public static void main(String[] args)  {
        Properties mainProperties = loadProperties("obj2/main_config.properties");
        String file = mainProperties.getProperty("file_to_use");
        Properties properties = loadProperties("obj2/" + file);

        String policeTel = properties.getProperty("police");

        String ambulanceTel = properties.getProperty("ambulance");

        String firestationTel = properties.getProperty("firestation");

        String notExisted = properties.getProperty(" ");


        System.out.println("not existed value: " + notExisted);

        System.out.println("emergency numbers: " +
                policeTel + " " +
                ambulanceTel + " "
                + firestationTel);
    }

    private static Properties loadProperties(String fileName) {
        Properties properties = new Properties();

        try(FileReader reader = new FileReader(fileName)){
            properties.load(reader);
        }catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return properties;
    }
}
