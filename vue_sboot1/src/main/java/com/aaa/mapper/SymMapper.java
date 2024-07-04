package com.aaa.mapper;

import com.aaa.entity.Sym;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SymMapper {
    public int addSym(Sym sym);
}
