package com.aaa.service.impl;

import com.aaa.entity.Dlxx;
import com.aaa.mapper.DlxxMapper;
import com.aaa.service.IDlxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DlxxServiceImpl implements IDlxxService {
    @Autowired
    DlxxMapper dlxxMapper;
    @Override
    public List<Dlxx> findAllDlxx(){
        return dlxxMapper.findAllDlxx();
    }
}
