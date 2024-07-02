package com.aaa.service.impl;

import com.aaa.entity.Bz;
import com.aaa.entity.Sc;
import com.aaa.mapper.ScMapper;
import com.aaa.service.IScService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScServiceImpl implements IScService {
    @Resource
    private ScMapper scMapper;
    @Override
    public PageInfo<Sc> list(Integer pageNum, Integer pageSize) {
        pageNum=pageNum==null?1:pageNum;
        pageSize=pageSize==null?3:pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Sc> scList = scMapper.findAll();
        PageInfo<Sc> pi = new PageInfo<Sc>(scList);
        return pi;
    }
    @Override
    public int Scinsert(Sc sc) {
        return scMapper.addSc(sc);
    }

    @Override
    public int Scupdate(Sc sc) {
        return scMapper.editSc(sc);
    }

    @Override
    public String Scdelete(String sym) {
        return scMapper.delSc(sym);
    }
}
