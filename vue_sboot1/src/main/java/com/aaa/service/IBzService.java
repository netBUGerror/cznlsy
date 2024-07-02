package com.aaa.service;

import com.aaa.entity.Bz;
import com.aaa.entity.Category;
import com.aaa.entity.Goods;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IBzService {
    List<Bz> list();
    int Bzinsert(Bz bz);
    int Bzupdate(Bz bz);
    String Bzdelete(String sym);
}
