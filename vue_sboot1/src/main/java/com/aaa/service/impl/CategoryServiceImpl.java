package com.aaa.service.impl;

import com.aaa.entity.Category;
import com.aaa.mapper.CategoryMapper;
import com.aaa.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.findAll();
    }
}
