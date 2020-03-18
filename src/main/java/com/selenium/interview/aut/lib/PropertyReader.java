package com.selenium.interview.aut.lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private static Properties prop = null;

    private static void loadProperties(String fileName){

        try
        {
            InputStream is = new FileInputStream("src/test/resources/"+fileName);
            prop = new Properties();
            prop.load(is);

        }catch (IOException ex){
            ex.getStackTrace();
        }

    }

    public static String getProperty(String fileName, String propName){
        loadProperties(fileName);
        return prop.getProperty(propName);
    }

}
