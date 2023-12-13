package config;

import lombok.Data;

import java.io.*;
import java.util.Properties;

@Data
public class  DbConfig {

    private static DbConfig instance = new DbConfig();

    public static DbConfig getInstance(){return instance;}

    private  Properties properties;
    private  String url;
    private  String driver;
    private  String username;
    private  String password;


   static  {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
       Properties properties = new Properties();
        try {
            initConfig();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties loadProperties() throws IOException {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        return properties;
    }

    // TODO 支持手动入参
    private static void initConfig() throws IOException {
        instance.properties = loadProperties();
        instance.url = instance.properties.getProperty("url");
        instance.driver = instance.properties.getProperty("driver");
        instance.username = instance.properties.getProperty("username");
        instance.password = instance.properties.getProperty("password");
    }
}
