package cn.under2.config;

import cn.under2.model.DbSourceConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

/**
 * 数据库连接池配置
 */
public class DbConfig {

  public static DataSource customDataSource(DbSourceConfig config) {
      HikariConfig hikariConfig = new HikariConfig();
      hikariConfig.setJdbcUrl(config.getJdbcUrl());
      hikariConfig.setUsername(config.getUsername());
      hikariConfig.setPassword(config.getPassword());
      hikariConfig.setDriverClassName(config.getDriverClassName());
      return new HikariDataSource(hikariConfig);
  }

}
