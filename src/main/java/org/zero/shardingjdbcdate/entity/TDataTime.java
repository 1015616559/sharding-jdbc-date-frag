package org.zero.shardingjdbcdate.entity;

import lombok.Data;

@Data
public class TDataTime {
    private long id;
    private String tName;
    private String tDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTName() {
        return tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

    public String getTDate() {
        return tDate;
    }

    public void setTDate(String tDate) {
        this.tDate = tDate;
    }
}
