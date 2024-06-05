package cn.under2.db2md.config;

import cn.under2.db2md.model.DbSourceConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

/**
 * 数据库连接池配置
 */
public class CustomDataSource {

  public static DataSource applyConfig(DbSourceConfig config) {
      HikariConfig hikariConfig = new HikariConfig();
      hikariConfig.setJdbcUrl(config.getJdbcUrl());
      hikariConfig.setUsername(config.getUsername());
      hikariConfig.setPassword(config.getPassword());
      hikariConfig.setDriverClassName(config.getDriverClassName());
      return new HikariDataSource(hikariConfig);
  }

}
