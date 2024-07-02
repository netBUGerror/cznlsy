package com.aaa.service;

import com.aaa.entity.Bz;
import com.aaa.entity.Goods;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IBzService {
    PageInfo<Bz> list(Integer pageNum,Integer pageSize);
    int Bzinsert(Bz bz);
    int Bzupdate(Bz bz);
    String Bzdelete(String sym);
}
