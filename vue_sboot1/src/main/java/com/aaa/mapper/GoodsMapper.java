package com.aaa.mapper;

import com.aaa.entity.Category;
import com.aaa.entity.Goods;
import com.aaa.entity.GoodsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> findAll(GoodsVO goodsVO);
    Goods findById(Integer goodsId);
    int doAdd(Goods goods);
    int doUpdate(Goods goods);
    int doDelete(Integer goodsId);
}
