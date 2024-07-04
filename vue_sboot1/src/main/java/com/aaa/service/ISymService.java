package com.aaa.service;

import com.aaa.entity.Sym;

import java.util.List;

public interface ISymService {
    public int addSym(Sym sym);
    public List<Sym> findAllSym();
}
