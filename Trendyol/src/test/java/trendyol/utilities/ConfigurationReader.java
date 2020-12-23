package trendyol.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    String file = "configuration.properties";
    FileInputStream fileInputStream;
    static Properties properties ;
    {
        try {
            fileInputStream = new FileInputStream(file);

            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static String get(String keyName) {
        return properties.getProperty(keyName);

}}
