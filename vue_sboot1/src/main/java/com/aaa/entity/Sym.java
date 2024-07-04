package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Sym {
    private int symbh;
    private String ncplxbh;
    private String dlxxbh;
    private String cpmc;
    private String lrr;
    private String sym;
    @DateTimeFormat(pattern = "YY:MM:DD HH:mm:ss")
    private Date lrsj;
    private String xgr;
    @DateTimeFormat(pattern = "YY:MM:DD HH:mm:ss")
    private Date xgsj;

    public int getSymbh() {
        return symbh;
    }

    public void setSymbh(int symbh) {
        this.symbh = symbh;
    }

    public String getNcplxbh() {
        return ncplxbh;
    }

    public void setNcplxbh(String ncplxbh) {
        this.ncplxbh = ncplxbh;
    }

    public String getDlxxbh() {
        return dlxxbh;
    }

    public void setDlxxbh(String dlxxbh) {
        this.dlxxbh = dlxxbh;
    }

    public String getCpmc() {
        return cpmc;
    }

    public void setCpmc(String cpmc) {
        this.cpmc = cpmc;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
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
