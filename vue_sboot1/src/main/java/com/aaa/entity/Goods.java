package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date produceDate;
    //关联对象
    private Category category;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", produceDate=" + produceDate +
                ", category=" + category +
                '}';
    }
}
