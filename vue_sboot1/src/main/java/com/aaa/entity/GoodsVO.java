package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GoodsVO extends Goods{
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "GoodsVO{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
