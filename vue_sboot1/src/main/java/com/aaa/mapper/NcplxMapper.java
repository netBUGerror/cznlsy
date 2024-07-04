package com.aaa.mapper;

import com.aaa.entity.Ncplx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NcplxMapper {
    public List<Ncplx> findAllNcplx();
}
