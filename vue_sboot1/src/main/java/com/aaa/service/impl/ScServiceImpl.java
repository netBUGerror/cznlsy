package com.aaa.service.impl;

import com.aaa.entity.Sc;
import com.aaa.mapper.ScMapper;
import com.aaa.service.IScService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScServiceImpl implements IScService {
    @Resource
    private ScMapper scMapper;
    @Override
    public List<Sc> list(){
        return scMapper.findAll();
    }
}
