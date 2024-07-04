package com.aaa.mapper;

import com.aaa.entity.Dlxx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DlxxMapper {
    public List<Dlxx> findAllDlxx();
}
