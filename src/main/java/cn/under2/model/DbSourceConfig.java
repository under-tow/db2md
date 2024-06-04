package cn.under2.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DbSourceConfig {
    private final String jdbcUrl;
    private final String username;
    private final String password;
    private final String driverClassName;


}
