package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Bz {
    private Integer scsjbh;
    private String bzdx;
    private String bzgg;
    private String bzr;
    @DateTimeFormat(pattern = "YY:MM:DD HH:mm:ss")
    private Date bzsj;
    private Integer bzsl;
    private String bzdd;
    private String sym;
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

    public String getBzdx() {
        return bzdx;
    }

    public void setBzdx(String bzdx) {
        this.bzdx = bzdx;
    }

    public String getBzgg() {
        return bzgg;
    }

    public void setBzgg(String bzgg) {
        this.bzgg = bzgg;
    }

    public String getBzr() {
        return bzr;
    }

    public void setBzr(String bzr) {
        this.bzr = bzr;
    }

    public Date getBzsj() {
        return bzsj;
    }

    public void setBzsj(Date bzsj) {
        this.bzsj = bzsj;
    }

    public Integer getBzsl() {
        return bzsl;
    }

    public void setBzsl(Integer bzsl) {
        this.bzsl = bzsl;
    }

    public String getBzdd() {
        return bzdd;
    }

    public void setBzdd(String bzdd) {
        this.bzdd = bzdd;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
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
