package config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

/**
 * 数据库连接池配置
 */
public class DbConfig {


  // TODO 加载不同驱动、或者都加载scope设置为provided ; dbConfig.getJdbc();

  public static DataSource getDataSource() {
      DbProperties dbProperties = DbProperties.getInstance();

      HikariConfig hikariConfig = new HikariConfig();
      hikariConfig.setJdbcUrl(dbProperties.getUrl());
      hikariConfig.setUsername(dbProperties.getUsername());
      hikariConfig.setPassword(dbProperties.getPassword());
      return new HikariDataSource(hikariConfig);
  }

}
