package com.aaa.mapper;

import com.aaa.entity.Bz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BzMapper {
    List<Bz> findAll();
}
