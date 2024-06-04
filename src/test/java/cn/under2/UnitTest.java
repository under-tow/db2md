package cn.under2;

import cn.under2.model.DbSourceConfig;
import org.junit.jupiter.api.Test;

public class UnitTest {


    @Test
    public void testGenerate() throws Exception {
        DbSourceConfig sourceConfig = DbSourceConfig.builder()
                .jdbcUrl("jdbc:postgresql://ip:5432/x")
                .password("123456")
                .driverClassName("org.postgresql.Driver")
                .username("postgres").build();
        MdUtil.db2md(sourceConfig);
    }

}
