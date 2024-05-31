package cn.under2;

import cn.under2.model.DbSourceConfig;
import org.junit.jupiter.api.Test;

public class UnitTest {


    @Test
    public void testGenerate() throws Exception {
        DbSourceConfig sourceConfig = new DbSourceConfig.Builder()
                .url("jdbc:postgresql://172.18.1.54:5432/dw_pro_dev")
                .password("123456")
                .username("postgres").build();
        MdUtil.db2md(sourceConfig);
    }

}
