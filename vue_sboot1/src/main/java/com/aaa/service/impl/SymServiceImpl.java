package com.aaa.service.impl;

import com.aaa.entity.Sym;
import com.aaa.mapper.SymMapper;
import com.aaa.service.ISymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SymServiceImpl implements ISymService {
    @Autowired
    SymMapper symMapper;
    @Override
    public int addSym(Sym sym){
        return symMapper.addSym(sym);
    }
}
