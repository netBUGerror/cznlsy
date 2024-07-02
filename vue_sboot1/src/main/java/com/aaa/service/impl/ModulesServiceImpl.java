package com.aaa.service.impl;

import com.aaa.entity.Modules;
import com.aaa.mapper.ModulesMapper;
import com.aaa.service.IModulesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModulesServiceImpl implements IModulesService {
    @Resource
    private ModulesMapper modulesMapper;
    @Override
    public List<Modules> list() {
        return modulesMapper.findAll();
    }
}
