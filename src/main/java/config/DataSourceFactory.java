package config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

public class DataSourceFactory {


  // TODO 加载不同驱动、或者都加载scope设置为provided ; dbConfig.getJdbc();


  public static DataSource getDataSource() {
      DbConfig dbConfig = DbConfig.getInstance();

      HikariConfig hikariConfig = new HikariConfig();
      hikariConfig.setJdbcUrl(dbConfig.getUrl());
      hikariConfig.setUsername(dbConfig.getUsername());
      hikariConfig.setPassword(dbConfig.getPassword());
      return new HikariDataSource(hikariConfig);
  }

}
