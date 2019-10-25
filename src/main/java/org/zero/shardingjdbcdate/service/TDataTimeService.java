package org.zero.shardingjdbcdate.service;

import org.springframework.stereotype.Service;
import org.zero.shardingjdbcdate.mapper.TDataTimeMapper;
import org.zero.shardingjdbcdate.entity.TDataTime;

import javax.annotation.Resource;
import java.util.Random;

@Service
public class TDataTimeService {
    @Resource
    private TDataTimeMapper tDataTimeMapper;

    public void insert() {
        String[] dates = {"201901", "201902", "201903"};

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int  num =rand.nextInt(3);
            // 插入订单
            long id = i;
            TDataTime t = new TDataTime();
            t.setId(id);
            t.setTName("张三" +num);
            t.setTDate(dates[num]);
            tDataTimeMapper.addOne(t);
        }


    }

}
