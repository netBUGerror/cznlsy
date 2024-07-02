package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Sc {
    private Integer scsjbh;
    private String sjlx;
    private String sjclr;
    private String cplx;
    private String sjnr;
    private String sym;
    @DateTimeFormat(pattern = "YY:MM:DD HH:mm:ss")
    private Date sjfssj;
    private String lrr;
    @DateTimeFormat(pattern = "YY:MM:DD HH:mm:ss")
    private Date lrsj;
    private String xgr;
    @DateTimeFormat(pattern = "YY:MM:DD HH:mm:ss")
    private Date xgsj;

    public Integer getScsjbh() {
        return scsjbh;
    }

    public void setScsjbh(Integer scsjbh) {
        this.scsjbh = scsjbh;
    }

    public String getSjlx() {
        return sjlx;
    }

    public void setSjlx(String sjlx) {
        this.sjlx = sjlx;
    }

    public String getSjclr() {
        return sjclr;
    }

    public void setSjclr(String sjclr) {
        this.sjclr = sjclr;
    }

    public String getCplx() {
        return cplx;
    }

    public void setCplx(String cplx) {
        this.cplx = cplx;
    }

    public String getSjnr() {
        return sjnr;
    }

    public void setSjnr(String sjnr) {
        this.sjnr = sjnr;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public Date getSjfssj() {
        return sjfssj;
    }

    public void setSjfssj(Date sjfssj) {
        this.sjfssj = sjfssj;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    public Date getXgsj() {
        return xgsj;
    }

    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }
}
