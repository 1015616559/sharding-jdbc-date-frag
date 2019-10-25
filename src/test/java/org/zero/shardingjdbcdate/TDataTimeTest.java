package org.zero.shardingjdbcdate;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zero.shardingjdbcdate.service.TDataTimeService;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "org.zero.shardingjdbcdate.mapper")
public class TDataTimeTest {

    @Autowired
    private TDataTimeService service;

    /**
     * 分库分表插入数据测试
     * 对userId取模
     */
    @Test
    public void insertData() throws Exception {
       service.insert();

    }

}

