package com.aaa.mapper;

import com.aaa.entity.Bz;
import com.aaa.entity.Sc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ScMapper {
    List<Sc> findAll();
    int addSc(Sc sc);
    int editSc(Sc sc);
    String delSc(String sym);
}
