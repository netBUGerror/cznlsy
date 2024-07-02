package com.aaa.controller;

import com.aaa.entity.Category;
import com.aaa.entity.Goods;
import com.aaa.entity.GoodsVO;
import com.aaa.service.ICategoryService;
import com.aaa.service.IGoodsService;
import com.aaa.util.CommonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
@CrossOrigin  //允许跨域请求
@RequestMapping("/goods")
@RestController  //所有方法默认返回json格式数据
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;
    @Autowired
    private ICategoryService categoryService;

    /*restful 部分*/
    @GetMapping("/list")  //等价于RequestMapping设置了请求方法为GET
    public PageInfo<Goods> list(GoodsVO goodsVO,Integer pageNum, Integer pageSize){
        PageInfo<Goods> pi = goodsService.list(goodsVO,pageNum,pageSize);
        return pi;
    }

    @GetMapping("/get/{goodsId}")
    public Map<String, Object> get(@PathVariable("goodsId") Integer goodsId){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Category> categoryList = categoryService.list();
        Goods goods = goodsService.findById(goodsId);
        map.put("goods",goods);
        map.put("categoryList",categoryList);
        return map;
    }

    @PostMapping("/add")
    public CommonResult add(@RequestBody Goods goods){
        goodsService.insert(goods);
        return CommonResult.RESULT_SUCCESS;
    }
    @PostMapping("/update")
    public CommonResult update(@RequestBody Goods goods){
        goodsService.update(goods);
        return CommonResult.RESULT_SUCCESS;
    }

    @DeleteMapping("/delete/{goodsId}")
    public CommonResult delete(@PathVariable("goodsId") Integer goodsId){
        goodsService.delete(goodsId);
        return CommonResult.RESULT_SUCCESS;
    }

    //页面跳转部分：多页面结构需要这个，单页面应用(SPA)不需要这个
    @RequestMapping(value = "/goods_list",method = RequestMethod.GET)
    public ModelAndView goods_list(){
        ModelAndView mv =new ModelAndView("goods_list");
        return  mv;
    }
    @RequestMapping(value = "/goods_add",method = RequestMethod.GET)
    public ModelAndView goods_add(){
        ModelAndView mv=new ModelAndView("goods_add");
        return mv;
    }

    @RequestMapping(value = "/goods_update",method = RequestMethod.GET)
    public ModelAndView goods_update(){
        ModelAndView mv=new ModelAndView("goods_update");
        return mv;
    }
}
