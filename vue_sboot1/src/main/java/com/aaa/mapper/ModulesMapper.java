package com.aaa.mapper;

import com.aaa.entity.Modules;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModulesMapper {
    List<Modules> findAll();
}
