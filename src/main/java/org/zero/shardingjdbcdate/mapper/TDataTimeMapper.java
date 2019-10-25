package org.zero.shardingjdbcdate.mapper;

import org.zero.shardingjdbcdate.entity.TDataTime;

import java.util.List;

public interface TDataTimeMapper {

    long addOne(TDataTime data);

    TDataTime getById(long id);

    List<TDataTime> getListByName(String tName);
}
