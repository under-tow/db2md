package config;

import lombok.Data;

import java.io.*;
import java.util.Properties;


/**
 * 数据库配置文件 db.properties文件读取
 */
@Data
public class DbProperties {

    private static DbProperties instance = new DbProperties();

    public static DbProperties getInstance(){return instance;}

    private  Properties properties;
    private  String url;
    private  String driver;
    private  String username;
    private  String password;


   static  {
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

    private static void initConfig() throws IOException {
        instance.properties = loadProperties();
        instance.url = instance.properties.getProperty("url");
        instance.driver = instance.properties.getProperty("driver");
        instance.username = instance.properties.getProperty("username");
        instance.password = instance.properties.getProperty("password");
    }
}
