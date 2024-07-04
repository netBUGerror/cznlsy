package com.aaa.service.impl;

import com.aaa.entity.Ncplx;
import com.aaa.mapper.NcplxMapper;
import com.aaa.service.INcplxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NcplxServiceImpl implements INcplxService {
    @Autowired
    NcplxMapper ncplxMapper;
    @Override
    public List<Ncplx> findAllNcplx(){
        return ncplxMapper.findAllNcplx();
    }
}
