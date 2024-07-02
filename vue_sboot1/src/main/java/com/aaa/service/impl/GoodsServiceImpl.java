package com.aaa.service.impl;

import com.aaa.entity.Goods;
import com.aaa.entity.GoodsVO;
import com.aaa.mapper.GoodsMapper;
import com.aaa.service.IGoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public PageInfo<Goods> list(GoodsVO goodsVO, Integer pageNum, Integer pageSize) {
        pageNum=pageNum==null?1:pageNum;
        pageSize=pageSize==null?3:pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = goodsMapper.findAll(goodsVO);
        PageInfo<Goods> pi = new PageInfo<Goods>(goodsList);
        return pi;
    }

    @Override
    public Goods findById(Integer goodsId) {
        return goodsMapper.findById(goodsId);
    }

    @Override
    public int insert(Goods goods) {
        return goodsMapper.doAdd(goods);
    }

    @Override
    public int update(Goods goods) {
        return goodsMapper.doUpdate(goods);
    }

    @Override
    public int delete(Integer goodsId) {
        return goodsMapper.doDelete(goodsId);
    }
}
