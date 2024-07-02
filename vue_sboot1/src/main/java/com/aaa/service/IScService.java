package com.aaa.service;

import com.aaa.entity.Bz;
import com.aaa.entity.Sc;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IScService {
    PageInfo<Sc> list(Integer pageNum, Integer pageSize);
    int Scinsert(Sc sc);
    int Scupdate(Sc sc);
    String Scdelete(String sym);
}
