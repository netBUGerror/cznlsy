package com.aaa.service.impl;

import com.aaa.entity.Bz;
import com.aaa.mapper.BzMapper;
import com.aaa.service.IBzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BzServiceImpl implements IBzService {
    @Resource
    private BzMapper bzMapper;
    @Override
    public List<Bz> list(){
        return bzMapper.findAll();
    }
}
