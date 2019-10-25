package org.zero.shardingjdbcdate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "org.zero.shardingjdbcdate.mapper")
@SpringBootApplication
public class ShardingJdbcDateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDateApplication.class, args);
    }

}
