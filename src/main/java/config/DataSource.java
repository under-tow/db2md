package config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {


  // TODO 加载不同驱动、或者都加载scope设置为provided ; dbConfig.getJdbc();


  public static Connection getConnection() throws SQLException {
      DbConfig dbConfig = DbConfig.getInstance();

      HikariConfig hikariConfig = new HikariConfig();
      hikariConfig.setJdbcUrl(dbConfig.getUrl());
      hikariConfig.setUsername(dbConfig.getUsername());
      hikariConfig.setPassword(dbConfig.getPassword());
      HikariDataSource dataSource = new HikariDataSource(hikariConfig);
      return dataSource.getConnection();
  }

}
