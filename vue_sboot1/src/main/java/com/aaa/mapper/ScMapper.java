package com.aaa.mapper;

import com.aaa.entity.Sc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ScMapper {
    List<Sc> findAll();
}
