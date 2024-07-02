package com.aaa.controller;

import com.aaa.entity.Category;
import com.aaa.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("/category")
@RestController
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    //查询所有商品分类
    @GetMapping("/list")
    public List<Category> list(){
        return categoryService.list();
    }
}
