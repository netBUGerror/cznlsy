package com.aaa.service;

import com.aaa.entity.Goods;
import com.aaa.entity.GoodsVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IGoodsService {
    PageInfo<Goods> list(GoodsVO goodsVO, Integer pageNum, Integer pageSize);
    Goods findById(Integer goodsId);
    int insert(Goods goods);
    int update(Goods goods);
    int delete(Integer goodsId);
}
