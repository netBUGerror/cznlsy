package com.aaa.mapper;

import com.aaa.entity.Sym;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SymMapper {
    public int addSym(Sym sym);
    public List<Sym> findAllSym();
}
