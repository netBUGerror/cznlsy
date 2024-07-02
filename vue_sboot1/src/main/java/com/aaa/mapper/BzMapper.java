package com.aaa.mapper;

import com.aaa.entity.Bz;
import com.aaa.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BzMapper {
    List<Bz> findAll();
    int addBz(Bz bz);
    int editBz(Bz bz);
    String delBz(String sym);
}
