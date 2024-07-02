package com.aaa.service.impl;

import com.aaa.entity.Bz;
import com.aaa.entity.Category;
import com.aaa.entity.Goods;
import com.aaa.entity.GoodsVO;
import com.aaa.mapper.BzMapper;
import com.aaa.service.IBzService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    @Override
    public int Bzinsert(Bz bz) {
        return bzMapper.addBz(bz);
    }

    @Override
    public int Bzupdate(Bz bz) {
        return bzMapper.editBz(bz);
    }

    @Override
    public String Bzdelete(String sym) {
        return bzMapper.delBz(sym);
    }
}
